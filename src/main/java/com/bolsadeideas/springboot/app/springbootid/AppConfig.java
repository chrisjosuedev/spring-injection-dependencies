package com.bolsadeideas.springboot.app.springbootid;

import com.bolsadeideas.springboot.app.springbootid.models.domain.ItemOrder;
import com.bolsadeideas.springboot.app.springbootid.models.domain.Product;
import com.bolsadeideas.springboot.app.springbootid.models.services.IService;
import com.bolsadeideas.springboot.app.springbootid.models.services.MyService;
import com.bolsadeideas.springboot.app.springbootid.models.services.MyServiceComplex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    // #2 - Register Component from AppConfig with @Bean.

    @Bean(("mySimpleService"))
    public IService registerMySimpleService() {
        return new MyService();
    }

    @Bean("myComplexService")
    @Primary
    public IService registerMyComplexService() {
        return new MyServiceComplex();
    }

    // Items Order
    @Bean("itemsInvoice")
    public List<ItemOrder> registerItem() {
        Product product1 = new Product("Camara Sony", 100);
        Product product2 = new Product("Bicicleta", 250);

        ItemOrder line1 = new ItemOrder(product1, 2);
        ItemOrder line2 = new ItemOrder(product2, 4);

        return Arrays.asList(line1, line2);
    }

    @Bean("itemsInvoiceOffice")
    public List<ItemOrder> registerItemOffice() {
        Product product1 = new Product("Monitor LG", 100);
        Product product2 = new Product("Impresora HP", 250);
        Product product3 = new Product("Escritorio Oficina", 250);

        ItemOrder line1 = new ItemOrder(product1, 2);
        ItemOrder line2 = new ItemOrder(product2, 4);
        ItemOrder line3 = new ItemOrder(product3, 1);

        return Arrays.asList(line1, line2, line3);
    }

}
