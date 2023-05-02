package com.example.etudiants.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.etudiants.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Long>{

}
