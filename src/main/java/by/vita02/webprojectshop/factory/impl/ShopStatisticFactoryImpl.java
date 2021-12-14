package by.vita02.webprojectshop.factory.impl;


import by.vita02.webprojectshop.entity.Clothes;
import by.vita02.webprojectshop.entity.Shop;
import by.vita02.webprojectshop.entity.ShopStatistic;
import by.vita02.webprojectshop.factory.ShopStatisticFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopStatisticFactoryImpl implements ShopStatisticFactory {

    public static final String DELIMITER = ", ";

    @Override
    public ShopStatistic createShopStatistic(Shop shop) {
        List<Clothes> shopClothes = shop.getClothes();
        Double averagePrice = shopClothes
                .stream()
                .mapToDouble(Clothes::getPrice)
                .average()
                .getAsDouble();
        Map<String, Integer> clothesTypesCount = new HashMap<>(); // key - type, value - count
        shopClothes.stream().forEach(x -> {
            if (clothesTypesCount.containsKey(x.getType())) {
                clothesTypesCount.replace(x.getType(), clothesTypesCount.get(x.getType()) + 1);
            } else {
                clothesTypesCount.put(x.getType(), 1);
            }
        });
        Integer maxFrequency = clothesTypesCount
                .values()
                .stream()
                .mapToInt(Integer::valueOf)
                .max()
                .getAsInt();
        StringBuilder mostPresentedTypes = new StringBuilder();
        clothesTypesCount.forEach((x, y) -> {
            if (y.equals(maxFrequency)) {
                mostPresentedTypes.append(x);
                mostPresentedTypes.append(DELIMITER);
            }
        });
        mostPresentedTypes.delete(mostPresentedTypes.length() - 2, mostPresentedTypes.length());
        return new ShopStatistic(averagePrice, mostPresentedTypes.toString());
    }
}
