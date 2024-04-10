package co.abiud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;

//import org.springframework.core.io.ClassPathResource;
//import org.springframework.beans.xml.XmlBeanFactory;

public class Client {

	public static void main(String[] args) {
		//Object Construction : Traditional way
		EmployeeInformation empInfo = new EmployeeInformation();
		empInfo.setEid(2020);
		empInfo.setEname("John");
		empInfo.setEaddress("Kasarani");
   System.out.println("Employee Information :" + empInfo);
   
       //Object Construction : The Spring Way (Inversion of Control)
	
   /* Resource resource = new ClassPathResource("data.xml");
	 BeanFactory factory = new XmlBeanFactory(resource);
	 
	 EmployeeInformation ei1 = (EmployeeInformation)factory.getBean("emp1");
	 EmployeeInformation ei2 = factory.getBean("emp2", EmployeeInformation.class);
	 EmployeeInformation ei3 = factory.getBean("emp3", EmployeeInformation.class);
	 
	*/
   
    //Method 2
   ApplicationContext context = new ClassPathXmlApplicationContext("data.xml");
   
   EmployeeInformation ei1 = (EmployeeInformation)context.getBean("emp1");
	 EmployeeInformation ei2 = context.getBean("emp2", EmployeeInformation.class);
	 EmployeeInformation ei3 = context.getBean("emp3", EmployeeInformation.class);
	 
   System.out.println( "First Employee :" + ei1);
	 System.out.println( "Second Employee :" + ei2);
	 System.out.println( "Third Employee :" + ei3);
   
	 //Shutting down the container
	 ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
	 cxt.close();
	}

}
