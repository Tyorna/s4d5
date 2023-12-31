package com.example.demo.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Pizze extends Edibili{
	public Pizze(String nome, Double prezzo, int calorie) {
		super(nome, prezzo, calorie);
	}
}
