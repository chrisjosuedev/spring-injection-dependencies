package com.bolsadeideas.springboot.app.springbootid.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
public class Order {
    @Value("${order.description}")
    private String description;
    @Autowired
    private Client client;
    @Autowired
    @Qualifier("itemsInvoiceOffice")
    private List<ItemOrder> items;

    @PostConstruct
    public void initialize() {
        client.setName(client.getName().concat(" ").concat(" José"));
        description = description.concat(" from: ").concat(client.getName());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Invoice destroyed: ".concat(description));
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<ItemOrder> getItems() {
        return items;
    }

    public void setItems(List<ItemOrder> items) {
        this.items = items;
    }
}
