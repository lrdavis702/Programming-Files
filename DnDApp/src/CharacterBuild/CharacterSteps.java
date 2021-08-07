// #description Screen that displays the steps to create a character and sends the user to associated class
package CharacterBuild;

import CharacterBuild.Step1Race.Step1Race;
import CharacterBuild.Step2Class.Step2Class;
import CharacterBuild.Step3AbilityScores.Step3AbilityScores;
import CharacterBuild.Step4Description.Step4Description;
import CharacterBuild.Step5Equipment.Step5Equipment;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.ConfigurePage;
import sample.LaunchScreen;

import java.util.ArrayList;

public abstract class CharacterSteps extends Application {
    public static void showScreen(Stage primaryStage) throws Exception {
        ArrayList<String> buttonsArray = new ArrayList<>();
        buttonsArray.add("Step 1: Choose Race");
        buttonsArray.add("Step 2: Choose Class");
        buttonsArray.add("Step 3: Determine Ability Scores");
        buttonsArray.add("Step 4: Describe Character");
        buttonsArray.add("Step 5: Choose Equipment");
        buttonsArray.add("Step 6: Add Team Members");
        buttonsArray.add("Step 7: Return to Main Menu");

        Button[] buttons;

        String backgroundImage = "file:Images/DefaultBackground.jpg";
        String titleImage = "file:Images/DefaultTitleImage.png";
        String screenTitle = "Character Builder";

        // calls class which configures an displays screen, returns the buttons in an array
        buttons = ConfigurePage.configureScreen(primaryStage, buttonsArray, backgroundImage, titleImage, screenTitle);

        // event handling for the screen
        buttons[0].setOnAction(actionEvent -> {
            try {
                Step1Race.showScreen(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        buttons[1].setOnAction(actionEvent -> {
            try {
                Step1Race.showScreen(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        buttons[2].setOnAction(actionEvent -> Step2Class.showScreen(primaryStage));
        buttons[3].setOnAction(actionEvent -> Step3AbilityScores.showScreen(primaryStage));
        buttons[4].setOnAction(actionEvent -> {
            try {
                Step4Description.showScreen(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        buttons[5].setOnAction(actionEvent -> Step5Equipment.showScreen(primaryStage));
        buttons[6].setOnAction(actionEvent -> {
            try {
                LaunchScreen.showScreen(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}