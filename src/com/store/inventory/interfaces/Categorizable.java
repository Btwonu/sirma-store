package com.store.inventory.interfaces;

import com.store.inventory.Category;

import java.util.ArrayList;

public interface Categorizable {
    void setCategories();
    ArrayList<Category> getCategoriesList();
}
