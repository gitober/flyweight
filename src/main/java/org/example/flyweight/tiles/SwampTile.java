package org.example.flyweight.tiles;

public class SwampTile extends Tile {
    public SwampTile() {
        super("Swamp");
    }

    @Override
    public char getCharacter() {
        return 'S';
    }
}
