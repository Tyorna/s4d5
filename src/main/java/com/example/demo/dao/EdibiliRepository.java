package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Edibili;
import com.example.demo.entities.Pizze;

@Repository
public interface EdibiliRepository extends JpaRepository<Edibili, Integer> {
	
			Optional<Edibili> findByNome(String name);

	}
