package fr.roudane.universite.matiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.roudane.universite.matiere.domain.matierebean;
@Repository
public interface ImatiereRepository extends JpaRepository<matierebean, Integer> {

}
