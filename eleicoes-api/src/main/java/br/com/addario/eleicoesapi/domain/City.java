package br.com.addario.eleicoesapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class City {
    @Id
    @Column(name = "CITY_ID", nullable = false)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "STATE")
    private String state;

    @Column(name = "STATE_ABBREVIATION")
    private String stateAbbreviation;

    @OneToMany
    private List<Candidate> candidates;
}
