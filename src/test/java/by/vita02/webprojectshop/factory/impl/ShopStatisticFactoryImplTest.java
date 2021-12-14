package by.vita02.webprojectshop.factory.impl;

import by.vita02.webprojectshop.entity.Clothes;
import by.vita02.webprojectshop.entity.Shop;
import by.vita02.webprojectshop.entity.ShopStatistic;
import by.vita02.webprojectshop.factory.ShopStatisticFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShopStatisticFactoryImplTest {

    ShopStatisticFactory shopStatisticFactory;
    Shop shop;

    @BeforeAll
    public void setUp(){
        shopStatisticFactory = new ShopStatisticFactoryImpl();
        Clothes clothes1 = new Clothes("Джинсы", "Клеш", 90);
        Clothes clothes2 = new Clothes("Юбка", "Карандаш", 45);
        Clothes clothes3 = new Clothes("Блузка", "Воротник Аскот", 70);
        Clothes clothes4 = new Clothes("Шорты", "Завышенная талия", 60);
        Clothes clothes5 = new Clothes("Шорты", "Длинные", 90);
        Clothes clothes6 = new Clothes("Джинсы", "Скинни", 180);
        Clothes clothes7 = new Clothes("Джинсы", "Слим", 220);
        List<Clothes> clothesList = List.of(clothes1, clothes2, clothes3, clothes4, clothes5, clothes6, clothes7);
        shop = new Shop("Минск", "Янки Брыля 24", "Марк Формель", clothesList);
    }

    @Test
    void createShopStatistic() {
        ShopStatistic expected = new ShopStatistic(107.85714285714286,"Джинсы");
        ShopStatistic actual = shopStatisticFactory.createShopStatistic(shop);
        Assertions.assertEquals(expected, actual);
    }
}