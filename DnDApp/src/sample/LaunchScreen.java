package sample;

import CampaignBuild.CampaignScreen;
import CharacterBuild.CharacterScreen;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.ArrayList;

public class LaunchScreen {
    public static void showScreen(Stage primaryStage) throws Exception {
        ArrayList<String> buttonsArray = new ArrayList<>();
        buttonsArray.add("Campaign");
        buttonsArray.add("Characters");
        Button[] buttons;

        String backgroundImage = "file:Images/DefaultBackground.png";
        String titleImage = "file:Images/DnDBuilderToolLogo.png";
        String screenTitle = "Dungeons & Dragons Builder Tool";

        buttons = ConfigurePage.configureScreen(primaryStage, buttonsArray, backgroundImage, titleImage, screenTitle);

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
