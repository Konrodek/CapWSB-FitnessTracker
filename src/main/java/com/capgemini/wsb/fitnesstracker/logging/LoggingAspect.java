package com.capgemini.wsb.fitnesstracker.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * LogginAspect pozwala na zbieranie logow na temat dzałania metod w serwisach.
 * Po i przed wykonaniu publicznych metod w klasach oznacoznych adnotacja loguje odnosnei tego informacje
 */
@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    /**
     * Przed uruchomieniem każdej metody dostępnej publicznie w serwisach, zapisywana jest informacja do logów. Format tego loga to 'Before method: [typ zwracany] [nazwa klasy].[nazwa metody]([typ parametru] [nazwa parametru], ...)'.
     * Ponadto, wykonują się operacje na dostarczonym join point, który dostarcza kontekstowych informacji o wykonywaniu operacji.
     */
    @Before("execution(public * com.capgemini.wsb.fitnesstracker..*.*(..)) && within(@org.springframework.stereotype.Service *)")
    public void logMethodCall(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.toShortString();
        logger.info("Before method: " + methodName);
    }

    /**
     * Po zakończeniu wykonywania metody w serwisach, rejestracja informacji do logów jest dokonywana.
     * Format tego logu to 'After method: [typ zwracany] [nazwa klasy].[nazwa metody]([typ parametru] [nazwa parametru], ...) returned: [wartość zwracana]'.
     * Dodatkowo, operacje są wykonywane na dostarczonym punkcie przecięcia (join point), który dostarcza kontekstowych informacji o wykonaniu, oraz na zwróconym obiekcie przez przeciętą metodę.
     */

    @AfterReturning(pointcut = "execution(public * com.capgemini.wsb.fitnesstracker..*.*(..)) && within(@org.springframework.stereotype.Service *)", returning = "result")
    public void logMethodReturn(JoinPoint joinPoint, Object result) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.toShortString();
        logger.info("After method: " + methodName + " returned: " + result);
    }
}
