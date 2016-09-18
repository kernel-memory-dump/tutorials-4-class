package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DataInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DataInsertion().insertInfo();

	}
	
	public void insertInfo(){
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory SF = con.buildSessionFactory();
		
		Session session = SF.openSession();
		
		DataProvider provider = new DataProvider();
		
		provider.setUser_id(121);
		provider.setUser_name("TEA");
		provider.setUser_adress("NekaAdresa");
		
		Transaction TR = session.beginTransaction(); 
		
		session.save(provider);
		
		System.out.println("Object saved!");
		
		TR.commit();
		
		session.close();
		
		SF.close();
		
		
		
	}
	
}
