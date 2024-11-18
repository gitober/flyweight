package org.example.flyweight.tiles;

public class WaterTile extends Tile {
    public WaterTile() {
        super("Water");
    }

    @Override
    public char getCharacter() {
        return 'W';
    }
}