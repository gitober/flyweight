package org.example.flyweight.tiles;

public abstract class Tile {
    private final String type;

    protected Tile(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract char getCharacter();
}
