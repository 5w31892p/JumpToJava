package practicequestions;

import java.util.HashMap;

public class Quiz03Enum {
    enum coffeeMenu {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }
        static void printCoffeePrice(coffeeMenu type) {
            HashMap<coffeeMenu, Integer> priceMap = new HashMap<>();
            priceMap.put(coffeeMenu.AMERICANO, 3000);  // 1: 아메리카노
            priceMap.put(coffeeMenu.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
            priceMap.put(coffeeMenu.CAFE_LATTE, 5000);  // 3: 카페라떼
            int price = priceMap.get(type);
            System.out.println(String.format("가격은 %d원 입니다.", price));
        }

        public static void main(String[] args) {
            printCoffeePrice(coffeeMenu.AMERICANO);
            printCoffeePrice(coffeeMenu.ICE_AMERICANO);
            printCoffeePrice(coffeeMenu.CAFE_LATTE);
    }
}
