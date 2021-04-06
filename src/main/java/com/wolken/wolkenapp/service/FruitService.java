package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.custom.MyException;
import com.wolken.wolkenapp.dto.FruitDTO;

public interface FruitService {
	public void ValidateandSave(FruitDTO dto) throws MyException;
	public void ValidateandDelete(int id) throws MyException;
	public void ValidateandUpdateById(int id);

}
