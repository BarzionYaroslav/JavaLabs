package com.example.Labwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LabworkApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml"
		);
		BakedBean bean = context.getBean("Person", BakedBean.class);
		SpringApplication.run(LabworkApplication.class, args);
		System.out.println(bean);

		WeaponShower shower = context.getBean("weaponShowerBean", WeaponShower.class);
		shower.show();
		context.close();
	}

}
