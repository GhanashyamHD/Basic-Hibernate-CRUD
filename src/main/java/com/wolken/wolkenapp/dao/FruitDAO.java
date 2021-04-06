package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.FruitDTO;

public interface FruitDAO {
	public void createFruit(FruitDTO fruitDTO);
	public void deleteFruit(FruitDTO fruitDTO);
    public void deleteFruit(int id);
	public void updateById(int id);

}
