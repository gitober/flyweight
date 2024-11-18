package org.example.flyweight.maps;

import org.example.flyweight.tiles.BuildingTile;
import org.example.flyweight.tiles.RoadTile;
import org.example.flyweight.tiles.Tile;

public class CityMap extends Map {
    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        int choice = random.nextInt(2);
        return switch (choice) {
            case 0 -> new RoadTile();
            case 1 -> new BuildingTile();
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
    }
}
