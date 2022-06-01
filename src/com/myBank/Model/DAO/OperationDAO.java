package com.myBank.Model.DAO;

import java.util.List;

import com.myBank.Model.Entities.Operation;

public class OperationDAO implements ImyBankDAO<Operation>{

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteAll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exists(Operation t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Operation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Operation t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveAll(List<Operation> ts) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Operation t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Operation t) {
		// TODO Auto-generated method stub
		return false;
	}

}
