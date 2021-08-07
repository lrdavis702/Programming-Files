// #description - First screen that launches when starting the app
package sample;

import CampaignBuild.CampaignScreen;
import CharacterBuild.CharacterScreen;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.ArrayList;

public class LaunchScreen {
    public static void showScreen(Stage primaryStage) throws Exception {
        ArrayList<String> buttonsArray = new ArrayList<>();
        // buttons for menu
        buttonsArray.add("Campaign");
        buttonsArray.add("Characters");
        Button[] buttons;

        String backgroundImage = "file:Images/LaunchBackground.png";
        String titleImage = "file:Images/DnDBuilderToolLogo.png";
        String screenTitle = "Dungeons & Dragons Builder Tool";

        // calls class which configures an displays screen, returns the buttons in an array
        buttons = ConfigurePage.configureScreen(primaryStage, buttonsArray, backgroundImage, titleImage, screenTitle);

        // event handling for the screen
        buttons[0].setOnAction(actionEvent -> CampaignScreen.showScreen(primaryStage));
        buttons[1].setOnAction(actionEvent -> {
            try {
                CharacterScreen.showScreen(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
