package com.wolken.wolkenapp.dao;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.wolken.wolkenapp.dto.FruitDTO;
public class FruitDAOImpl implements FruitDAO{
	Scanner sc = new Scanner(System.in);
	@Override
	public void createFruit(FruitDTO fruitDTO) {
		// TODO Auto-generated method stub
    Configuration configuration = new Configuration();
    configuration.configure();
    configuration.addAnnotatedClass(FruitDTO.class);
     SessionFactory factory = configuration.buildSessionFactory();
     Session session = factory.openSession();
     Transaction transaction = session.beginTransaction();
     session.save(fruitDTO);
     transaction.commit();
     session.close();
     factory.close();
	}

//	@Override
//	public void getFruit() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void deleteFruit(int id) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
        configuration.configure();
       configuration.addAnnotatedClass(FruitDTO.class);
        SessionFactory factory = configuration.buildSessionFactory();
	     Session session = factory.openSession();
	    FruitDTO dtofromdb = session.get(FruitDTO.class, id);
	     Transaction transaction = session.beginTransaction();
	    
          session.delete(dtofromdb);
          transaction.commit();
          System.out.println("deleted");
	}

	@Override
	public void deleteFruit(FruitDTO fruitDTO) {
		// TODO Auto-generated method stub

	    Configuration configuration = new Configuration();
	    configuration.configure();
	    configuration.addAnnotatedClass(FruitDTO.class);
	     SessionFactory factory = configuration.buildSessionFactory();
	     Session session = factory.openSession();
	     Transaction transaction = session.beginTransaction();
	     session.delete(fruitDTO);
	     transaction.commit();
	     session.close();
	     factory.close();

		
	}

	@Override
	public void updateById(int id) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
        configuration.configure();
       configuration.addAnnotatedClass(FruitDTO.class);
        SessionFactory factory = configuration.buildSessionFactory();
	     Session session = factory.openSession();
	    FruitDTO dtofromdb = session.get(FruitDTO.class, id);
	    System.out.println("Enter the fruit name to be updated");
	    dtofromdb.setFruitName(sc.next());
	     Transaction transaction = session.beginTransaction();
          session.update(dtofromdb);
          transaction.commit();	
	}

//	@Override
//	public void getFruit() {
//		// TODO Auto-generated method stub
//		 Configuration configuration = new Configuration();
//		    configuration.configure();
//		    configuration.addAnnotatedClass(FruitDTO.class);
//		     SessionFactory factory = configuration.buildSessionFactory();
//		     Session session = factory.openSession();
//		     Transaction transaction = session.beginTransaction();
//		     session.
//		
//	}
}
