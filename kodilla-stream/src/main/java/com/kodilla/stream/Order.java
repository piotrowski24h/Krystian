package com.kodilla.stream;

import java.util.HashSet;
import java.util.Set;

public class Order {
    private final Set<Product> list = new HashSet<>();

    public void add(Product product) {
        list.add(product);
    }

    public Set<Product> getList() {
        return list;
    }
}
