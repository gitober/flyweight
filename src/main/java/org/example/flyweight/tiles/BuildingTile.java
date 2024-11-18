package org.example.flyweight.tiles;

public class BuildingTile extends Tile {
    public BuildingTile() {
        super("Building");
    }

    @Override
    public char getCharacter() {
        return 'B';
    }
}
