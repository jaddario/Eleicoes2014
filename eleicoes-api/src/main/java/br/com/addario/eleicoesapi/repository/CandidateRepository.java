package br.com.addario.eleicoesapi.repository;

import br.com.addario.eleicoesapi.domain.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Long, Candidate> {
}
