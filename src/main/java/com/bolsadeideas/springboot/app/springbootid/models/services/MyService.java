package com.bolsadeideas.springboot.app.springbootid.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// #1 - Register component with @Component Notation
//@Component("mySimpleService")
// @Primary -> Allows you select defect Component. | Recommended.
//@Primary
public class MyService implements IService {

    @Override
    public String operation() {
        return "Some simple process...";
    }
}
