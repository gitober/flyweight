package org.example.flyweight.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import org.example.flyweight.game.Game;
import org.example.flyweight.maps.Map;
import org.example.flyweight.rendering.TileGraphicFactory;
import org.example.flyweight.rendering.TileRenderer;

public class GameController {

    @FXML
    private Canvas mapCanvas;

    @FXML
    private ComboBox<String> mapTypeComboBox;

    private final TileGraphicFactory tileGraphicFactory = new TileGraphicFactory();

    public void initialize() {
        mapTypeComboBox.getItems().addAll("City", "Wilderness");
        mapTypeComboBox.setValue("City");
    }

    @FXML
    private void generateMap() {
        String selectedMapType = mapTypeComboBox.getValue();
        if (selectedMapType == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Please select a map type.");
            alert.showAndWait();
            return;
        }

        Map map = Game.createMap(selectedMapType.toLowerCase(), 20, 15);
        TileRenderer renderer = new TileRenderer(tileGraphicFactory);
        renderer.render(mapCanvas, map.getTiles());
    }

    @FXML
    private void exitApplication() {
        Platform.exit();
    }
}
