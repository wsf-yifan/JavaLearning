package com.yifan.springboot;

import com.yifan.springboot.config.DiConfig;
import com.yifan.springboot.config.JavaConfig;
import com.yifan.springboot.service.UseFunctionService;
import com.yifan.springboot.service.UseHelloService;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		System.out.println("Begin to start.");

		// normal configuration
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

		UseHelloService useHelloService = context.getBean(UseHelloService.class);
		System.out.println(useHelloService.sayHello());

		context.close();

		// JAVA CONFIGURATION
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService useFunctionService = ctx.getBean(UseFunctionService.class);

		System.out.println(useFunctionService.sayHi());
		ctx.close();
	}

}
