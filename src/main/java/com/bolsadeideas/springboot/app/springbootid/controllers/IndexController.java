package com.bolsadeideas.springboot.app.springbootid.controllers;

import com.bolsadeideas.springboot.app.springbootid.models.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Object Injection with -> @Autowired
    @Autowired
    // @Qualifier -> Select Specific Component.
    //@Qualifier("mySimpleService")
    private IService service;

    @GetMapping({"/", "", "/index"})
    public String index(Model model) {
        // Operation Method from IService -> MyService (Model)
        model.addAttribute("object", service.operation());
        return "index";
    }

}
