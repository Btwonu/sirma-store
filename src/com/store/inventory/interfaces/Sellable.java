package com.store.inventory.interfaces;

import java.math.BigDecimal;

public interface Sellable {
    BigDecimal setPrice();
    BigDecimal getPrice();
    void sell();
}