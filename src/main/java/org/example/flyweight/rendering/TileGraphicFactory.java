package org.example.flyweight.rendering;

import javafx.scene.image.Image;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private final Map<String, Image> tileGraphics = new HashMap<>();

    public Image getTileGraphic(String type) {
        if (!tileGraphics.containsKey(type)) {
            String resourcePath = switch (type) {
                case "Forest" -> "/images/forest.png";
                case "Water" -> "/images/water.png";
                case "Road" -> "/images/road.png";
                case "City" -> "/images/city.png";
                case "Swamp" -> "/images/swamp.png";
                default -> "/images/forest.png"; // Default to forest image
            };
            URL resourceURL = getClass().getResource(resourcePath);
            if (resourceURL == null) {
                throw new IllegalArgumentException("Resource not found: " + resourcePath);
            }

            tileGraphics.put(type, new Image(resourceURL.toString()));
        }
        return tileGraphics.get(type);
    }
}
