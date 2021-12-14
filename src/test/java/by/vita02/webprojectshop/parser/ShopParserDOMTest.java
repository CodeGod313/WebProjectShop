package by.vita02.webprojectshop.parser;

import by.vita02.webprojectshop.entity.Clothes;
import by.vita02.webprojectshop.entity.Shop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShopParserDOMTest {

    ShopParserDOM shopParserDOM;
    List<Clothes> clothesList;

    @BeforeAll
    public void  setUp(){
        shopParserDOM = new ShopParserDOM();
        Clothes clothes1 = new Clothes("Джинсы", "Клеш", 90);
        Clothes clothes2 = new Clothes("Юбка", "Карандаш", 45);
        Clothes clothes3 = new Clothes("Блузка", "Воротник Аскот", 70);
        Clothes clothes4 = new Clothes("Шорты", "Завышенная талия", 60);
        Clothes clothes5 = new Clothes("Шорты", "Длинные", 90);
        Clothes clothes6 = new Clothes("Джинсы", "Скинни", 180);
        Clothes clothes7 = new Clothes("Джинсы", "Слим", 220);
        clothesList = List.of(clothes1, clothes2, clothes3, clothes4, clothes5, clothes6, clothes7);
    }

    @Test
    void parse() {
        Shop expected = new Shop("Минск", "Янки Брыля 24", "Марк Формель", clothesList);
        Shop actual = shopParserDOM.parse();
        Assertions.assertEquals(expected,actual);
    }
}