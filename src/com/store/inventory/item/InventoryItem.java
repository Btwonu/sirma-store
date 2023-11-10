package com.store.inventory.item;

import com.store.inventory.Category;
import com.store.inventory.interfaces.Categorizable;
import com.store.inventory.interfaces.Sellable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public abstract class InventoryItem implements Sellable, Categorizable {
    private UUID id;
    private String title;
    private String description;
    private BigDecimal price;
    private ArrayList<Category> categoriesList;

    InventoryItem(String title, String description, BigDecimal price, Category... categories) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.price = price;
        this.categoriesList = new ArrayList<>(Arrays.asList(categories));
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public ArrayList<Category> getCategoriesList() {
        return categoriesList;
    }

    private void setId(UUID id) {
        this.id = id;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        if (this.price.compareTo(price) < 0) {
            throw new IllegalArgumentException("Price cannot be less than 0");
        }

        this.price = price;
    }
}
