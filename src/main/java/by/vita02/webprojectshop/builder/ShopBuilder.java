package by.vita02.webprojectshop.builder;


import by.vita02.webprojectshop.entity.Clothes;
import by.vita02.webprojectshop.entity.Shop;

public interface ShopBuilder {
    void setTown(String town);

    void setStreet(String street);

    void setFirm(String firm);

    void addClothes(Clothes clothes);

    Shop build();
}
