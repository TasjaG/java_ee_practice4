package com.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	@SuppressWarnings("resource")
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
    	HelloBean obj = (HelloBean) context.getBean("helloBean");
    	obj.printHello();

    }
}
