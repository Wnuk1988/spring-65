package com.tms;

import com.tms.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringStart {
    public static void main(String[] args) {
        // 1. Вариант:
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-settings.xml");
//        Employee employee = context.getBean("employee-bean",Employee.class);
        // 2. Вариант:
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Employee employee = context.getBean("employee-bean", Employee.class);
//        Employee employeeOne = context.getBean("employee-bean", Employee.class);
//        System.out.println(employee.hashCode());
//        System.out.println(employeeOne.hashCode());
//        System.out.println(employee.getHrManager().name);
        //((ConfigurableApplicationContext) context).close();

        //aop
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        AspectTestClass aspectTestClass = context.getBean("aspectTestClass", AspectTestClass.class);
//        aspectTestClass.printOne();
//        aspectTestClass.returnTen();
    }

         //3. Вариант:
//    @Bean(value = "employee-bean")
//    public static Employee employeeBean() {
//        return new Employee();
//    }
}
