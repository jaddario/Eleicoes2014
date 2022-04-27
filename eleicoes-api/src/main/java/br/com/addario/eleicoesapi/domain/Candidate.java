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
public class Candidate {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String party;
    private String name;
    private Integer votes;
    private Double votePercentage;

    public Candidate from(CandidateDTO dto) {
        return Candidate.builder()
                        .id(dto.getId())
                        .name(dto.getName())
                        .party(dto.getParty())
                        .votes(dto.getVotes())
                        .votePercentage(dto.getVotePercentage())
                        .build();
    }

}
