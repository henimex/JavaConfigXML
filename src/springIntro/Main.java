package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//CustomerManager customerManager = new CustomerManager(new CustomerDal());
		//customerManager.add();
		
		//CustomerManager manager = new CustomerManager(new MySQLCustomerDal());
		//manager.add();
		
		System.out.println("After XML File");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		
		//CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		customerService.add();
	}
}
