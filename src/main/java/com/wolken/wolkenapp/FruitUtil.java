package com.wolken.wolkenapp;
import java.util.Scanner;
import com.wolken.wolkenapp.custom.MyException;
import com.wolken.wolkenapp.dao.FruitDAO;
import com.wolken.wolkenapp.dao.FruitDAOImpl;
import com.wolken.wolkenapp.dto.FruitDTO;
import com.wolken.wolkenapp.service.FruitService;
import com.wolken.wolkenapp.service.FruitServiceImpl;

public class FruitUtil {
	public static void main(String[] args) {
		FruitDTO dto = new FruitDTO();
		FruitDAO dao = new FruitDAOImpl();
		FruitService fs = new FruitServiceImpl();
		Scanner sc = new Scanner(System.in);
		// int opt = sc.nextInt();
//	while(true) {
//		try {
//		System.out.println("Enter Id");
//		dto.setFruitId(sc.nextInt());
//		System.out.println("Enter Name");
//		dto.setFruitName(sc.next());
//		fs.ValidateandSave(dto);
//		}catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.toString());
//		}
//	}
		// System.out.println("The last entr is deleted");
//	 	
//		
//		try {
//			System.out.println("Enter the ID to be deleted");
//			dto.setFruitId(sc.nextInt());
//			System.out.println("Enter the name to be deleted");
//			dto.setFruitName(sc.next());
//			dao.deleteFruit(dto);
//			fs.ValidateandDelete(2);
//		} catch (MyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Enter the id to be updated");
		fs.ValidateandUpdateById(sc.nextInt());
	}
//	dto.setFruitId(1);
//	dto.setFruitName("apple");
//	dao.createFruit(dto);

}
