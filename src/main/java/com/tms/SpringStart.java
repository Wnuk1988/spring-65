package com.tms;

import com.tms.aop.AspectTestClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@EnableAspectJAutoProxy // активирует аор
@ComponentScan("com.tms") // с какой папки начинать вычитывать все классы
public class SpringStart {
    public static void main(String[] args) {
        // 1. Вариант:
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-settings.xml");
//        Employee employee = context.getBean("employee-bean",Employee.class);
        // 2. Вариант:
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringStart.class);
//        Employee employee = context.getBean("employee-bean", Employee.class);
//        Employee employeeOne = context.getBean("employee-bean", Employee.class);
//        System.out.println(employee.hashCode());
//        System.out.println(employeeOne.hashCode());
//        System.out.println(employee.getHrManager().name);
        //((ConfigurableApplicationContext) context).close();

        //aop
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringStart.class);
        AspectTestClass aspectTestClass = context.getBean("aspectTestClass", AspectTestClass.class);
        aspectTestClass.printOne();
        aspectTestClass.returnTen();
    }

        // 3. Вариант:
//    @Bean(value = "employee-bean")
//    public static Employee employeeBean() {
//        return new Employee();
//    }
}
