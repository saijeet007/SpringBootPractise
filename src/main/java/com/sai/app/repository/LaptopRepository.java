package com.sai.app.repository;

import com.sai.app.model.Laptop;
import org.springframework.stereotype.Component;

@Component
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in Database");

    }
}
