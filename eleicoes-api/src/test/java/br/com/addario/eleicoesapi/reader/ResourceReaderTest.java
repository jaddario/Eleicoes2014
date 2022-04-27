package br.com.addario.eleicoesapi.reader;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ResourceReaderTest {

    @Test
    void shouldReadTextFromResource() {
        String stringFromResource = null;
        try {
            stringFromResource = ResourceReader.getStringFromResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertNotNull(stringFromResource);
    }

}