package demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo1.ShoppingCart.checkOut(..))")
    public void beforeLogger(JoinPoint jp){
       // System.out.println(jp.getSignature());

        String arg= jp.getArgs()[0].toString();
        System.out.println("before loggers with arguments:"+ arg);

       // System.out.println("BEFORE Loggers!!");
    }

    @After ("execution(* *.*.checkOut(..))")
    public void afterLogger(){
        System.out.println("AFTER loggers!!!");

    }
/*
    @Pointcut("execution(* demo1.ShoppingCart.quantity(..))")
    public void afterReturningPointcut(){

    }
    @AfterReturning(pointcut="afterReturningPointCut()",
    returning= "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning:" + retVal);
    }

 */
}
