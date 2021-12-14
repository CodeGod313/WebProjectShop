package by.vita02.webprojectshop.builder.impl;


import by.vita02.webprojectshop.builder.ClothesBuilder;
import by.vita02.webprojectshop.entity.Clothes;

public class ClothesBuilderImpl implements ClothesBuilder {
    private String type;
    private String model;
    private int price;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Clothes build() {
        return new Clothes(type, model, price);
    }
}
