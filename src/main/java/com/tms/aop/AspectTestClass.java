package com.tms.aop;

import com.tms.annotations.AspectAnnotation;
import org.springframework.stereotype.Component;

@Component
public class AspectTestClass {

    @AspectAnnotation
    public void printOne(){
        System.out.println("One");
    }
    public int returnTen(){
//        if (true){
//            throw new ArithmeticException();
//        }
        return 10;
    }
}
