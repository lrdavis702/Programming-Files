package CharacterBuild;

import CampaignBuild.CampaignScreen;
import CharacterBuild.Step1Race.RaceTraits;
import CharacterBuild.Step1Race.Step1Race;
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
import sample.ConfigurePage;
import sample.LaunchScreen;

import java.util.ArrayList;

public abstract class CharacterScreen extends Application {
    public static void showScreen(Stage primaryStage) throws Exception {
        ArrayList<String> buttonsArray = new ArrayList<>();
        buttonsArray.add("Create a New Character");
        buttonsArray.add("Auto Generate Character");
        buttonsArray.add("Load Character");
        buttonsArray.add("Modify Character");
        buttonsArray.add("Delete Character");
        buttonsArray.add("Return to Main Menu");

        Button[] buttons;

        String backgroundImage = "file:Images/CharacterBuildImage.jpg";
        String titleImage = "file:Images/CharactersTitle.png";
        String screenTitle = "Character Builder";

        buttons = ConfigurePage.configureScreen(primaryStage, buttonsArray, backgroundImage, titleImage, screenTitle);

        buttons[0].setOnAction(actionEvent -> Step1Race.showScreen(primaryStage));
        buttons[1].setOnAction(actionEvent -> AutoCharacter.showScreen(primaryStage));
        buttons[2].setOnAction(actionEvent -> LoadCharacter.showScreen(primaryStage));
        buttons[3].setOnAction(actionEvent -> ModCharacter.showScreen(primaryStage));
        buttons[4].setOnAction(actionEvent -> {
            try {
                DelCharacter.showScreen(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        buttons[5].setOnAction(actionEvent -> {
            try {
                LaunchScreen.showScreen(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}

    /*public static void showScreen(Stage primaryStage) {
        double buttonSize = 200;
        double gridPadding = 50;
        double sw = 315;
        double sh = 812;

        // button configurations
        Button bNewCharacter = new Button("Create a New Character");
        Button bAutoCharacter = new Button("Auto Generate Character");
        Button bLoadCharacter = new Button("Load Character");
        Button bModCharacter = new Button("Modify Character");
        Button bDelCharacter = new Button("Delete Character");
        Button bReturnMainScreen = new Button("Return to Main Menu");
        bNewCharacter.setMinWidth(buttonSize);
        bAutoCharacter.setMinWidth(buttonSize);
        bLoadCharacter.setMinWidth(buttonSize);
        bModCharacter.setMinWidth(buttonSize);
        bDelCharacter.setMinWidth(buttonSize);
        bReturnMainScreen.setMinWidth(buttonSize);

        // configuration for background image
        Image bgImage = new Image("file:Images/CharacterBuildImage.jpg");
        ImageView bgImageView = new ImageView(bgImage);
        bgImageView.fitWidthProperty().bind(primaryStage.widthProperty());
        bgImageView.setPreserveRatio(true);
        BackgroundSize backgroundSize = new BackgroundSize(sw, sh, true, true, true, true);
        BackgroundImage backgroundImage = new BackgroundImage(bgImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        Background background = new Background(backgroundImage);

        // GridPane configuration
        GridPane gPane = new GridPane();
        gPane.setAlignment(Pos.BOTTOM_CENTER);
        gPane.setVgap(10);
        gPane.setHgap(10);
        gPane.setPadding(new Insets(gridPadding));
        gPane.setBackground(background);

        // event handling
        bNewCharacter.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Step1Race.showScreen(primaryStage, sw, sh);
            }
        });

        bLoadCharacter.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                LoadCharacter.showScreen(primaryStage, sw, sh);
            }
        });

        bAutoCharacter.setOnAction(actionEvent -> AutoCharacter.showScreen(primaryStage, sw, sh));

        bModCharacter.setOnAction(actionEvent -> ModCharacter.showScreen(primaryStage, sw, sh));

        bDelCharacter.setOnAction(actionEvent -> {
            try {
                DelCharacter.showScreen(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        bReturnMainScreen.setOnAction(actionEvent -> System.out.println("This doesn't return to the main menu"));

        gPane.add(bNewCharacter, 0, 0);
        gPane.add(bAutoCharacter, 0, 1);
        gPane.add(bLoadCharacter, 0, 2);
        gPane.add(bModCharacter, 0, 3);
        gPane.add(bDelCharacter, 0, 4);
        gPane.add(bReturnMainScreen, 0, 5);

        primaryStage.setTitle("Character Screen");
        primaryStage.setScene(new Scene(gPane, sw, sh));
        primaryStage.show();

    }
}
*/