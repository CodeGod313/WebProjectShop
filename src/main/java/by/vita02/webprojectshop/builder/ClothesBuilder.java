package by.vita02.webprojectshop.builder;


import by.vita02.webprojectshop.entity.Clothes;

public interface ClothesBuilder {

    void setType(String type);

    void setModel(String model);

    void setPrice(int price);

    Clothes build();
}
