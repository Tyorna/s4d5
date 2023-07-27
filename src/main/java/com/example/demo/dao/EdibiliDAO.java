package com.example.demo.dao;

import java.util.List;

import com.example.demo.entities.Edibili;

public interface EdibiliDAO {
	public void save(Edibili edibile);

	public void findByIdAndUpdate(int id, Edibili edibile);

	public void findByIdAndDelete(int id);

	public Edibili findById(int id);

	public List<Edibili> findAll();
}
