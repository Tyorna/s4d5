package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Edibili")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
	@Getter
	@Setter
	@ToString
	@AllArgsConstructor
public abstract class Edibili {
	
		@Id
		@GeneratedValue
		private int id;
		private String nome;
		private Double prezzo;
		private int calorie;
		
		
	public Edibili(String nome, Double prezzo, int calorie) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.calorie = calorie;
	}
}