package br.com.addario.eleicoesapi.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CandidateDTO {
    private Long id;

    private String party;
    private String name;
    private Integer votes;
    private Double votePercentage;

    public CandidateDTO from(Candidate entity) {
        return CandidateDTO.builder()
                           .id(entity.getId())
                           .name(entity.getName())
                           .party(entity.getParty())
                           .votes(entity.getVotes())
                           .votePercentage(entity.getVotePercentage())
                           .build();
    }
}
