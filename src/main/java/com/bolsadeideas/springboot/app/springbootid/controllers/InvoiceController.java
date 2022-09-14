package com.bolsadeideas.springboot.app.springbootid.controllers;

import com.bolsadeideas.springboot.app.springbootid.models.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private Order order;

    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("title", "Invoice with Injection Dependecies");
        model.addAttribute("order", order);
        return "invoice/view";
    }

}
