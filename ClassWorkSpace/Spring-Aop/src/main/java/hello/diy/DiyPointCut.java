package hello.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class DiyPointCut {
    @Before("execution(* com.service..*.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }
}
