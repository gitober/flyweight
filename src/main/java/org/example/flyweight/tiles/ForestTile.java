package org.example.flyweight.tiles;

public class ForestTile extends Tile {
    public ForestTile() {
        super("Forest");
    }

    @Override
    public char getCharacter() {
        return 'F';
    }
}
