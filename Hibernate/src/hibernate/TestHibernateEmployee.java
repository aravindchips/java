package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class TestHibernateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate.properties")
				.buildSessionFactory();
	
		
		Session session=factory.openSession();
		Session session1=factory.openSession();
		
		Transaction t=session.beginTransaction();
		Transaction t1=session1.beginTransaction();
		
		Employee st=new Employee();
		st.setId(145);
		st.setFtname("Shivam");
		st.setLtname("Dubey");
		session.save(st);
		t.commit();
		
		Employee st1=new Employee();
		st1.setId(133);
		st1.setFtname("Sai Aravind");
		st1.setLtname("N");
		session1.save(st1);
		t1.rollback();
		
		session1.close();
		session.close();
		factory.close();
	}

}