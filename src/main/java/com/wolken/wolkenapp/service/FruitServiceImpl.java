package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.custom.MyException;
import com.wolken.wolkenapp.dao.FruitDAO;
import com.wolken.wolkenapp.dao.FruitDAOImpl;
import com.wolken.wolkenapp.dto.FruitDTO;

public class FruitServiceImpl implements FruitService {
	 FruitDAO dao = new FruitDAOImpl();
	@Override
	public void ValidateandSave(FruitDTO dto) throws MyException  {
		// TODO Auto-generated method stub
	 if(dto.getFruitId()>0 && dto.getFruitId()<1000) {
		 
	 
	      if(dto.getFruitName() != null) {
				dao.createFruit(dto);
				throw new MyException();
				}
		
			else {
				System.out.println("Invalid Input");
			}	
		}
	}
	@Override
	public void ValidateandDelete(int id) throws MyException {
		// TODO Auto-generated method stub
	
			dao.deleteFruit(id);
	
		
	}
	@Override
	public void ValidateandUpdateById(int id) {
		// TODO Auto-generated method stub
		if(id>0) {
			dao.updateById(id);
		}
		
	}
	}
	


