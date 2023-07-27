package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.PizzeDAO;
import com.example.demo.entities.Pizze;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PizzeRunner implements CommandLineRunner {
		
	@Autowired 
		private PizzeDAO pDAO;
	
		@Override
		
		public void run(String... args) throws Exception {
			log.info("** Save**");
//			Pizze pizzaMargherita = Pizze.builder().nome("Pizza Margherita").prezzo(5.99).calorie(1070).build();
//			Pizze pizzaProsciutto = Pizze.builder().nome("Pizza Prosciutto").prezzo(7.99).calorie(1100).build();
//			Pizze pizzaSalame = Pizze.builder().nome("Pizza Salame").prezzo(8.99).calorie(1110).build();
//			Pizze pizzaVegetariana = Pizze.builder().nome("Pizza Vegetariana").prezzo(9.99).calorie(970).build();
//			 pDAO.save(pizzaMargherita);
//			 pDAO.save(pizzaProsciutto);
//			 pDAO.save(pizzaSalame);
//			 pDAO.save(pizzaVegetariana);

			 log.info("** Delete **");
			pDAO.findByIdAndDelete(2);
			
				log.info("** Find by Id **");
				log.info(pDAO.findById(3).toString());

			log.info("********************* FIND ALL ********************");
			pDAO.findAll().forEach(pizza -> log.info(pizza.toString()));
		}
}

