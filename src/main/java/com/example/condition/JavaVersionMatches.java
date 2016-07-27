package com.example.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by krishna_hotha on 7/27/16.
 */
public class JavaVersionMatches implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        System.out.println("in conditon");
        if(System.getProperty("java.version").startsWith("1.8")){
            return true;
        }
        return false;
    }
}
