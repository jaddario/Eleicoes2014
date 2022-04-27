package br.com.addario.eleicoesapi.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class ResourceReader {
    private static final String FILE_NAME = "/data/resultado-1-turno-presidente-2014.json";

    public static String getStringFromResource() throws IOException {

        URL resource = ResourceReader.class.getResource(FILE_NAME);

        BufferedReader reader = null;
        StringBuilder builder = null;
        try {

            reader = new BufferedReader(new FileReader(Objects.requireNonNull(resource).getFile()));

            builder = new StringBuilder();
            String line = reader.readLine();
            while (line != null) {
                builder.append(line)
                       .append(System.lineSeparator());
                line = reader.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            Objects.requireNonNull(reader).close();
        }

        return builder.toString();
    }

}
