package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Pizze;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PizzeService implements PizzeDAO {
	
		@Autowired
		private PizzeRepository pizzaRepo;

		public void save(Pizze pizza) {
			pizzaRepo.save(pizza);
			log.info(pizza.getNome() + " salvata!");
		}

		public List<Pizze> findAll() {
			return pizzaRepo.findAll();
		}

		public Pizze findById(int id){
			Optional<Pizze> pizza = pizzaRepo.findById(id);
			return pizza.get();
		}

		public void findByIdAndUpdate(int id, Pizze pizza) {
			Pizze trovata = this.findById(id);
			trovata.setNome(pizza.getNome());
			trovata.setPrezzo(pizza.getPrezzo());
			trovata.setCalorie(pizza.getCalorie());
	 pizzaRepo.save(trovata);
		}

		public void findByIdAndDelete(int id){
			Pizze found = this.findById(id);
			pizzaRepo.delete(found);
		}
}
