package com.bolsadeideas.springboot.app.springbootid.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// #1 - Register component with @Component Notation
//@Component("myComplexService")
public class MyServiceComplex implements IService {

    @Override
    public String operation() {
        return "Some complex process | applied from @Qualifier ...";
    }
}
