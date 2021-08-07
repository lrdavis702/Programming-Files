// #Screen that let's the user choose to create a character (manually/automatically, load a character, modify a
// character, delete a character
package CharacterBuild;

import javafx.application.Application;
import javafx.scene.control.Button;
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

        // calls class which configures an displays screen, returns the buttons in an array
        buttons = ConfigurePage.configureScreen(primaryStage, buttonsArray, backgroundImage, titleImage, screenTitle);

        // event handling for the screen
        buttons[0].setOnAction(actionEvent -> {
            try {
                CharacterSteps.showScreen(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
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