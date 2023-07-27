package com.example.demo.dao;

import java.util.List;

import com.example.demo.entities.Pizze;

public interface PizzeDAO {
	public void save(Pizze pizze);

	public void findByIdAndUpdate(int id, Pizze pizze);

	public void findByIdAndDelete(int id);

	public Pizze findById(int id);

	public List<Pizze> findAll();
}
