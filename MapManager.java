package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapManager {
    public static void main(String[] args) {
        Map<String, Integer> priceMap = new HashMap<>();
        priceMap.put("TV", 500);
        priceMap.put("Phone", 200);
        priceMap.put("Car", 20000);
        priceMap.put("Bike", 6000);
        priceMap.put("Furniture", 700);

       
        System.out.println("price map: " + priceMap);

        Set<String> keys = priceMap.keySet();
       

        System.out.println("keys of Map : " + keys);
        

    }

}
