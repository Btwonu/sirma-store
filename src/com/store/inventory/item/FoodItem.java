package com.store.inventory.item;

import com.store.inventory.Category;
import com.store.inventory.interfaces.Perishable;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class FoodItem extends InventoryItem implements Perishable {
    FoodItem(String title, String description, BigDecimal price, Category... categories) {
        super(title, description, price, categories);
    }

    @Override
    public void setCategories() {

    }

    @Override
    public ArrayList<Category> getCategoriesList() {
        return null;
    }

    @Override
    public LocalDate getExpirationDate() {
        return null;
    }

    @Override
    public void setExpirationDate() {

    }

    @Override
    public BigDecimal setPrice() {
        return null;
    }

    @Override
    public BigDecimal getPrice() {
        return null;
    }

    @Override
    public void sell() {

    }
}
