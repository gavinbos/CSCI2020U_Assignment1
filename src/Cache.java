import java.util.HashMap;
import java.util.Map;

class Cache {
    // HashTable implementation of a Java Map
    private static Map<String, Food> foods = new HashMap<>();

    static {
        foods.put("Burger", new Burger(""));
        foods.put("HotDog", new HotDog(""));
    }

    /**
     * @param foodName name of the food item
     * @return clone of one of the Food objects within the cache
     */
    public static Food getFood(String foodName) {
        return (Food) foods.get(foodName).clone();
    }
}