package by.vita02.webprojectshop.main;



import by.vita02.webprojectshop.entity.Shop;
import by.vita02.webprojectshop.entity.ShopStatistic;
import by.vita02.webprojectshop.factory.ShopStatisticFactory;
import by.vita02.webprojectshop.factory.impl.ShopStatisticFactoryImpl;
import by.vita02.webprojectshop.parser.ShopParserDOM;
import by.vita02.webprojectshop.parser.ShopParserSax;

public class Main {
    public static void main(String[] args) {
        ShopParserDOM parserDOM = new ShopParserDOM();
        ShopParserSax shopParserSax = new ShopParserSax();
        Shop shop = parserDOM.parse();
        System.out.println(shop);
        ShopStatisticFactory shopStatisticFactory = new ShopStatisticFactoryImpl();
        ShopStatistic shopStatistic = shopStatisticFactory.createShopStatistic(shop);
        System.out.println(shopStatistic);
    }
}


        




