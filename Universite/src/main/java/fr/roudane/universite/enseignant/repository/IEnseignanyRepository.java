package fr.roudane.universite.enseignant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.roudane.universite.enseignant.domain.EnseignantBean;
@Repository
public interface IEnseignanyRepository extends JpaRepository<EnseignantBean, Integer> {

}
