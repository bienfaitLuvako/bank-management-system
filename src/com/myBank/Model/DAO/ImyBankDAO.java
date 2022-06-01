package com.myBank.Model.DAO;

import java.util.List;

public interface ImyBankDAO<T> {
	
	public int count();

	public boolean deleteAll();

	public boolean delete(T t);

	public boolean exists(T t);
	
	public List<T> findAll();
	
	public T findById(Long id);
	
	public boolean save(T t);
	
	public boolean saveAll(List<T> ts);
	
	public boolean update(T t);
	
	
}
