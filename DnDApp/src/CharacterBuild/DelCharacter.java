package CharacterBuild;

import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.ConfigurePage;
import sample.LaunchScreen;

import java.util.ArrayList;

public class DelCharacter {
    public static void showScreen(Stage primaryStage) throws Exception {
        ArrayList<String> buttonsArray = new ArrayList<>();
        buttonsArray.add("1st button");
        buttonsArray.add("Return to Main Menu");
        Button[] buttons;

        String backgroundImage = "file:Images/DefaultBackground.png";
        String titleImage = "file:Images/DnDBuilderToolLogo.png";
        String screenTitle = "Delete Character";

        // calls class which configures an displays screen, returns the buttons in an array
        buttons = ConfigurePage.configureScreen(primaryStage, buttonsArray, backgroundImage, titleImage, screenTitle);

        // event handling for the screen
        buttons[0].setOnAction(actionEvent -> System.out.println(buttonsArray.get(0) + "not configured"));
        buttons[1].setOnAction(actionEvent -> {
            try {
                LaunchScreen.showScreen(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
