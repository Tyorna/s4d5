package com.example.demo.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Bevande extends Edibili{
	public Bevande(String nome, Double prezzo, int calorie) {
		super(nome, prezzo, calorie);
	}
}
