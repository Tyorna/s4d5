package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Edibili;
import com.example.demo.entities.Pizze;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EdibiliService implements EdibiliDAO {
	
		@Autowired
		private EdibiliRepository edibiliRepo;

		public void save(Edibili edibili) {
			 edibiliRepo.save(edibili);
			log.info(edibili.getNome() + " salvata!");
		}

		public List<Edibili> findAll() {
			return edibiliRepo.findAll();
		}

		public Edibili findById(int id){
			Optional<Edibili> edibile =  edibiliRepo.findById(id);
			return edibile.get();
		}

		public void findByIdAndUpdate(int id, Edibili edibili) {
			Edibili trovata = this.findById(id);
			trovata.setNome(edibili.getNome());
			trovata.setPrezzo(edibili.getPrezzo());
			trovata.setCalorie(edibili.getCalorie());
			edibiliRepo.save(trovata);
		}

		public void findByIdAndDelete(int id){
			Edibili found = this.findById(id);
			edibiliRepo.delete(found);
		}
}
