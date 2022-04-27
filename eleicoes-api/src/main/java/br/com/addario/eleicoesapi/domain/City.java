package br.com.addario.eleicoesapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class City {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String noum;
}
