package com.store.cart;

import java.util.UUID;

public class Order {
    UUID id;

    Order() {
        this.id = UUID.randomUUID();
    }
}
