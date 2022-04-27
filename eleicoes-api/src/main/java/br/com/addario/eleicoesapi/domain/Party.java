package br.com.addario.eleicoesapi.domain;

import br.com.addario.eleicoesapi.domain.exceptions.PartyNotFoundException;

import java.util.Arrays;

public enum Party {

    PSB("PSB"),
    PSDB("PSDB"),
    PT("PT"),
    PSC("PSC"),
    PSOL("PSOL"),
    PRTB("PRTB"),
    PV("PV"),
    PSDC("PSDC"),
    PSTU("PSTU"),
    PCB("PCB"),
    PCO("PCO");

    private String name;

    Party(String name) {
        this.name = name;
    }

    public static Party from(String partyName) {
        return Arrays.stream(values())
                     .filter(party -> party.name.equalsIgnoreCase(partyName))
                     .findFirst()
                     .orElseThrow(() -> new PartyNotFoundException(partyName));
    }


}
