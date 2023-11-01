package com.store.inventory.interfaces;

import java.time.LocalDate;

public interface Perishable {
    LocalDate getExpirationDate();
    void setExpirationDate();
}