package com.workintech.s17d2.tax;

public interface Taxable {
    Double getSimpleTaxRate();
    Double getMiddleTaxRate();
    Double getUpperTaxRate();
}
