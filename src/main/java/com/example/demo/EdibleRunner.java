package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EdibiliDAO;
import com.example.demo.entities.Bevande;
import com.example.demo.entities.Pizze;

import lombok.extern.slf4j.Slf4j;


@Component
	@Slf4j
public class EdibleRunner implements CommandLineRunner {
			
		@Autowired 
			private EdibiliDAO pDAO;
		
			@Override
			
			public void run(String... args) throws Exception {
				log.info("** Save**");
				Pizze pizzaMargherita = new Pizze ("Pizza Margherita", 5.99, 1070);
				Pizze pizzaProsciutto =  new Pizze ("Pizza Prosciutto", 7.99, 1100);
				Pizze pizzaSalame =  new Pizze ("Pizza Salame", 8.99, 1110);
				Pizze pizzaVegetariana = new Pizze ("Pizza Vegetariana", 9.99, 970);
				 pDAO.save(pizzaMargherita);
				 pDAO.save(pizzaProsciutto);
				 pDAO.save(pizzaSalame);
				 pDAO.save(pizzaVegetariana);
				 Bevande cocaCola = new Bevande("CocaCola", 3.99, 370);
				 pDAO.save(cocaCola);

//				 log.info("** Delete **");
//				pDAO.findByIdAndDelete(2);
//				
//					log.info("** Find by Id **");
//					log.info(pDAO.findById(3).toString());
	//
//				log.info("********************* FIND ALL ********************");
//				pDAO.findAll().forEach(pizza -> log.info(pizza.toString()));
			}
	}

