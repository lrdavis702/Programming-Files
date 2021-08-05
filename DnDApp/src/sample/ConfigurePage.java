package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public abstract class ConfigurePage extends Application {

    public static Button[] configureScreen(Stage primaryStage, ArrayList<String> buttonsArray, String backgroundImage,
                                           String titleImage, String screenTitle) throws Exception {
        double screenWidth = 375;
        double screenHeight = 812;
        double padding = 25;
        double bottomPadding = 50;
        double buttonSize = 100;

        Button[] buttons = new Button[buttonsArray.size()];

// buttons for display
        for (int i = 0; i < buttonsArray.size(); i++) {
            buttons[i] = new Button(buttonsArray.get(i));
            buttons[i].setMinWidth(buttonSize);
        }

        // configurations for top image on screen
        Image topImage = new Image(titleImage);
        ImageView topImageView = new ImageView(topImage);
        topImageView.setFitWidth(screenWidth - (padding * 2));
        topImageView.setPreserveRatio(true);

        // configuration for background image
        Image bgImage = new Image(backgroundImage);
        ImageView bgImageView = new ImageView(bgImage);
        bgImageView.fitWidthProperty().bind(primaryStage.widthProperty());
        bgImageView.setPreserveRatio(true);
        BackgroundSize backgroundSize = new BackgroundSize(screenWidth, screenHeight, true, true, true, true);
        BackgroundImage bki = new BackgroundImage(bgImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        Background background = new Background(bki);

        // BorderPane configuration
        BorderPane bPane = new BorderPane();
        bPane.setBackground(background);
        bPane.setPadding(new Insets(padding, padding, bottomPadding, padding));

        // top element of BorderPane configuration
        GridPane topGPane = new GridPane();
        topGPane.setAlignment(Pos.TOP_CENTER);
        topGPane.setVgap(10);
        topGPane.setHgap(10);
        topGPane.add(topImageView, 0, 0);

        // bottom element of BorderPane configuration (buttons)
        GridPane bottomGPane = new GridPane();
        bottomGPane.setAlignment(Pos.TOP_CENTER);
        bottomGPane.setVgap(10);
        bottomGPane.setHgap(10);
        for (int i = 0; i < buttonsArray.size(); i++) {
            bottomGPane.add(buttons[i], 0, i);
        }

        // Add GridPane elements to BorderPane
        bPane.setTop(topGPane);
        bPane.setBottom(bottomGPane);

        // Stage configuration, add BorderPane to Stage, show Stage
        primaryStage.setTitle(screenTitle);
        primaryStage.setScene(new Scene(bPane, screenWidth, screenHeight)); // iPhone 10x dimensions
        primaryStage.show();
        return buttons;
    }
}