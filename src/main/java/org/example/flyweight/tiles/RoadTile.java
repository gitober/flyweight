package org.example.flyweight.tiles;

public class RoadTile extends Tile {
    public RoadTile() {
        super("Road");
    }

    @Override
    public char getCharacter() {
        return 'R';
    }
}
