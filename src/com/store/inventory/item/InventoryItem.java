package com.store.inventory.item;

import com.store.inventory.Category;
import com.store.inventory.interfaces.Categorizable;
import com.store.inventory.interfaces.Sellable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public abstract class InventoryItem implements Sellable, Categorizable {
    UUID id;
    String title;
    String description;
    BigDecimal price;
    ArrayList<Category> categoriesList;

    InventoryItem(String title, String description, BigDecimal price, Category... categories) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.price = price;
        this.categoriesList = new ArrayList<>(Arrays.asList(categories));
    }
}
