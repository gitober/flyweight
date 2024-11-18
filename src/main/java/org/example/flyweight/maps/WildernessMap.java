package org.example.flyweight.maps;

import org.example.flyweight.tiles.ForestTile;
import org.example.flyweight.tiles.SwampTile;
import org.example.flyweight.tiles.Tile;
import org.example.flyweight.tiles.WaterTile;

public class WildernessMap extends Map {
    public WildernessMap(int width, int height) {
        super(width, height); // Call parent constructor
    }

    @Override
    protected Tile createTile() {
        int choice = random.nextInt(3); // Randomly choose a tile type
        return switch (choice) {
            case 0 -> new SwampTile();
            case 1 -> new WaterTile();
            case 2 -> new ForestTile();
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
    }
}
