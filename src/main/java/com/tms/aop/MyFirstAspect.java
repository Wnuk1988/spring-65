package com.tms.aop;

import jakarta.annotation.PostConstruct;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Aspect // говорит о том что класс будет аспектом
@Component
public class MyFirstAspect {
    //@Before();
    //@After();
    //@Around();
    //@AfterThrowing;
    //@AfterReturning;

    // Pointcut - где (срез Join pointo'ов)
    // Advice - в какой момент выполнения метода

    // когда ОТДЕЛЬНО прописаны:
    @Pointcut(value = "execution(public * com.tms.aop.*.*())")
    void emptyMethod(){
    }
    @After("emptyMethod()")
    public void checkPoint(){
        System.out.println("Point work!");
    }

    //    @Before(value = "within(com.tms.aop.*)") // перед выполнением метода
//    public void startTimeEvent(JoinPoint joinPoint){ // joinPoint - точка где работает аспект
//        System.out.println(LocalTime.now() + " " + joinPoint.getSignature().getName() + " method start working...");
//    }

    //    @After(value = "within(com.tms.aop.*)") // перед выполнением метода
//    public void endTimeEvent(JoinPoint joinPoint) { // joinPoint - точка где работает аспект
//        System.out.println(LocalTime.now() + " " + joinPoint.getSignature().getName() + " method end work...");


//        @Around(value = "within(com.tms.aop.*)")
//    public Object aroundExampleMethod(ProceedingJoinPoint joinPoint) throws Throwable {
//       // System.out.println("Method started " + joinPoint.getSignature().getName());
//        LocalTime startTime = LocalTime.now();
//        Object returnValue = joinPoint.proceed();
//        LocalTime endTime = LocalTime.now();
//        System.out.println("Time method: "  + (endTime.getNano() - startTime.getNano()));
//       // System.out.println("Method finished " + joinPoint.getSignature().getName());
//        return returnValue;
//    }

    //    @AfterThrowing(value = "within(com.tms.aop.*)", throwing = "err")
//    public void printAfterThrowing(Throwable err){
//        System.out.println(err);
//    }

    //       @AfterReturning(value = "within(com.tms.aop.*)", returning = "retValue")
//    public void returned(Object retValue) {
//        System.out.println("Print return value from aspect: " + retValue);
//    }


    //    @Before(value = "execution(public * com.tms.aop.*.*())") // перед выполнением метода
//    public void startTimeEvent(JoinPoint joinPoint) { // joinPoint - точка где работает аспект
//        System.out.println(LocalTime.now() + " " + joinPoint.getSignature().getName() + " method start working...");
//    }

    // СВОИ АНАТАЦИИ
//    @Before(value = "@annotation(com.tms.annotations.AspectAnnotation)") // перед выполнением метода
//    public void startTimeEvent(JoinPoint joinPoint) { // joinPoint - точка где работает аспект
//        System.out.println(LocalTime.now() + " " + joinPoint.getSignature().getName() + " method start working...");
//    }
}
