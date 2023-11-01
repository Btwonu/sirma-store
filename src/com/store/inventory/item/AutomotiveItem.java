package com.store.inventory.item;

import com.store.inventory.Category;
import com.store.inventory.interfaces.Breakable;

import java.math.BigDecimal;
import java.util.ArrayList;

public class AutomotiveItem extends InventoryItem implements Breakable {
    AutomotiveItem(String title, String description, BigDecimal price, Category... categories) {
        super(title, description, price, categories);
    }

    @Override
    public void breakItem() {

    }

    @Override
    public void setCategories() {

    }

    @Override
    public ArrayList<Category> getCategoriesList() {
        return null;
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
