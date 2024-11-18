package org.example.flyweight.rendering;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import org.example.flyweight.tiles.Tile;

public class TileRenderer {
    private final TileGraphicFactory graphicFactory;

    public TileRenderer(TileGraphicFactory graphicFactory) {
        this.graphicFactory = graphicFactory;
    }

    public void render(Canvas canvas, Tile[][] tiles) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        int tileSize = 32;

        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        for (int row = 0; row < tiles.length; row++) {
            for (int col = 0; col < tiles[row].length; col++) {
                Tile tile = tiles[row][col];
                if (tile != null) { // Ensure the tile is not null
                    gc.drawImage(
                            graphicFactory.getTileGraphic(tile.getType()),
                            col * tileSize,
                            row * tileSize,
                            tileSize,
                            tileSize
                    );
                }
            }
        }
    }
}
