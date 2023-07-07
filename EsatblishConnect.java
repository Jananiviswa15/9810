package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class EsatblishConnect {
	static Session connectToDB() {
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Mobile.class);
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		return session;

	}
	public static void main(String args[]) {

		Mobile mob = new Mobile();
		mob.setBarndName("samsung");
		mob.setTotalCost(1000);

		Employee firstEmp = new Employee();
		firstEmp.setEmpName("vijay");
		firstEmp.setSalary(10000);
		firstEmp.setMobile(mob);
		
		Session getSession = connectToDB();
		getSession.beginTransaction();
//		getSession.save(mob);
//		getSession.save(firstEmp);
		getSession.save(firstEmp);  //save parent auto save the child obj
		
		//	getSession.persist(firstEmp);  
		getSession.getTransaction().commit();
	}
}
