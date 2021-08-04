package sample;

import CampaignBuild.CampaignScreen;
import CharacterBuild.CharacterScreen;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        double screenWidth = 375;
        double screenHeight = 812;
        double padding = 25;
        double bottomPadding = 50;
        double buttonSize = 100;

        // buttons for display
        Button bCampaign = new Button("Campaigns");
        Button bCharacters = new Button("Characters");
        bCharacters.setMinWidth(buttonSize);
        bCampaign.setMinWidth(buttonSize);

        // images on screen
        Image bgImage = new Image("file:Images/DefaultBackground.png");
        Image logoImage = new Image("file:Images/DnDBuilderToolLogo.png");

        ImageView bgImageView = new ImageView(bgImage);
        ImageView logoImageView = new ImageView(logoImage);
        logoImageView.setFitWidth(screenWidth - (padding * 2));
        logoImageView.setPreserveRatio(true);

        // configuration for background image
        bgImageView.fitWidthProperty().bind(primaryStage.widthProperty());
        bgImageView.setPreserveRatio(true);
        BackgroundSize backgroundSize = new BackgroundSize(screenWidth, screenHeight, true, true, true, true);
        BackgroundImage backgroundImage = new BackgroundImage(bgImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        Background background = new Background(backgroundImage);

        // BorderPane configuration
        BorderPane bPane = new BorderPane();
        bPane.setBackground(background);
        bPane.setPadding(new Insets(padding, padding, bottomPadding, padding));

        // top element of BorderPane configuration
        GridPane topGPane = new GridPane();
        topGPane.setAlignment(Pos.TOP_CENTER);
        topGPane.setVgap(10);
        topGPane.setHgap(10);
        topGPane.add(logoImageView, 0, 0);

        // bottom element of BorderPane configuration
        GridPane bottomGPane = new GridPane();
        bottomGPane.setAlignment(Pos.TOP_CENTER);
        bottomGPane.setVgap(10);
        bottomGPane.setHgap(10);
        bottomGPane.add(bCampaign, 0, 0);
        bottomGPane.add(bCharacters, 0, 1);

        // event handling
        bCharacters.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                CharacterScreen.showScreen(primaryStage, screenWidth, screenHeight);
            }
        });

        bCampaign.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                CampaignScreen.showScreen(primaryStage, screenWidth, screenHeight);
            }
        });

        // Add GridPane elements to BorderPane
        bPane.setTop(topGPane);
        bPane.setBottom(bottomGPane);

        // Stage configuration, add BorderPane to Stage, show Stage
        primaryStage.setTitle("D&D Builder Tool");
        primaryStage.setScene(new Scene(bPane, screenWidth, screenHeight)); // iPhone 10x dimensions
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}