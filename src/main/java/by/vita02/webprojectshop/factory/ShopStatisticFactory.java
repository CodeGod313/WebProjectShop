package by.vita02.webprojectshop.factory;


import by.vita02.webprojectshop.entity.Shop;
import by.vita02.webprojectshop.entity.ShopStatistic;

public interface ShopStatisticFactory {
    ShopStatistic createShopStatistic(Shop shop);
}
