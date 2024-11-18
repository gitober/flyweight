package org.example.flyweight.maps;

import org.example.flyweight.tiles.Tile;

import java.util.Random;

public abstract class Map {
    protected int width;
    protected int height;
    protected Tile[][] tiles;
    protected Random random = new Random();

    protected Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[height][width];
        generateMap(); // Automatically generate the map on construction
    }

    // Generate the map
    private void generateMap() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = createTile(); // Create tile for each position
            }
        }
    }

    // Abstract method to create a tile (implemented by subclasses)
    protected abstract Tile createTile();

    // Getter for tiles array to support graphical rendering
    public Tile[][] getTiles() {
        return tiles;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                builder.append(tiles[i][j].getCharacter()).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
