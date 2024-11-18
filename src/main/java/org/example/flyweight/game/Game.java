package org.example.flyweight.game;

import org.example.flyweight.maps.CityMap;
import org.example.flyweight.maps.Map;
import org.example.flyweight.maps.WildernessMap;

public class Game {
    public static Map createMap(String type, int width, int height) {
        if (type.equalsIgnoreCase("city")) {
            return new CityMap(width, height);
        } else if (type.equalsIgnoreCase("wilderness")) {
            return new WildernessMap(width, height);
        } else {
            throw new IllegalArgumentException("Unknown map type: " + type);
        }
    }
}
