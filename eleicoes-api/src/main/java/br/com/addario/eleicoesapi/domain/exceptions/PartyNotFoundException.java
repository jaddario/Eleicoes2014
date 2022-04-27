package br.com.addario.eleicoesapi.domain.exceptions;

public class PartyNotFoundException extends RuntimeException {
    public PartyNotFoundException(String name) {
        super(String.format("Party not found with name: %s", name));
    }
}
