// #Description class that takes the user through the first step of character creation (Race)
// #REFACTOR - Lots of redundant code. How do I call ConfigurePage method for Top/Bottom/Title of BorderPane?
// #BUG - Background image not resizing. Why?

package CharacterBuild.Step1Race;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import sample.ConfigurePage;
import sample.LaunchScreen;
import sample.PageDimensions;

import java.util.ArrayList;

public abstract class Step1Race extends ConfigurePage{
    public static void showScreen(Stage primaryStage) throws Exception {
        PageDimensions dimensions = new PageDimensions();
        double buttonSize = dimensions.getButtonSize();
        double screenHeight = dimensions.getScreenHeight();
        double screenWidth = dimensions.getScreenWidth();
        double padding = dimensions.getPadding();
        double bottomPadding = dimensions.getBottomPadding();

        ArrayList<String> buttonsArray = new ArrayList<>();
        buttonsArray.add("Save");
        buttonsArray.add("Return to Main Menu");
        Button[] buttons = new Button[buttonsArray.size()];

        String backgroundImage = "file:Images/RaceBackground.png";
        String titleImage = "file:Images/Step1Race.png";
        String screenTitle = "Race";

        String[] labelsArray = new String[]{"Ability Score Modifiers: ", "Age: ", "Alignment: ", "Size: ", "Speed: ",
                "Dwarf Traits: ", "languages: ", "Subrace: "};

        String[] textArray = new String[]{"Ability Score Mod needs coding ", "Age needs coding ", "Alignment needs coding ",
        "Size needs coding ", "Speed needs coding ", "Dwarf Traits needs coding ", "languages needs coding ",
                "Subrace needs coding "};

        String[] raceRadioButton = new String[]{"Dwarf", "Elf", "Halfling", "Human", "Dragonborn", "Gnome", " Half-Elf",
                "Half-Orc", "Tielfling"};

        System.out.println("Step 1: Race screen in development");

        // configuration for background image
        Image bgImage = new Image(backgroundImage);
        ImageView bgImageView = new ImageView(bgImage);
        bgImageView.fitWidthProperty().bind(primaryStage.widthProperty());
        bgImageView.setPreserveRatio(true);
        BackgroundSize backgroundSize = new BackgroundSize(screenWidth, screenHeight, true, true, true, true);
        BackgroundImage bki = new BackgroundImage(bgImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(bki);

        // BorderPane configuration
        BorderPane bPane = new BorderPane();
        bPane.setBackground(background);
        bPane.setPadding(new Insets(padding, padding, bottomPadding, padding));


        // **********start config for TOP BORDERPANE
        // configurations for top image on screen
        Image topImage = new Image(titleImage);
        ImageView topImageView = new ImageView(topImage);
        topImageView.setFitWidth(screenWidth - (padding * 2));
        topImageView.setPreserveRatio(true);

        // top element of BorderPane configuration
        GridPane topGPane = new GridPane();
        topGPane.setAlignment(Pos.TOP_CENTER);
        topGPane.setVgap(10);
        topGPane.setHgap(10);
        topGPane.add(topImageView, 0, 0);
        // **********end config for TOP BORDERPANE


        // **********start config for CENTER BORDERPANE
        // configures radio dials for race selection
        ToggleGroup raceGroup = new ToggleGroup();
        RadioButton[] raceRadioButtons = new RadioButton[raceRadioButton.length];
        Label chooseRaceText = new Label("Choose a Race");
        chooseRaceText.setAlignment(Pos.CENTER);

        for (int i = 0; i < raceRadioButton.length; i++) {
            raceRadioButtons[i] = new RadioButton(raceRadioButton[i]);
            raceRadioButtons[i].setToggleGroup(raceGroup);
        }

        // configures labels and fields
        Label[] labels = new Label[labelsArray.length];
        TextField[] textFields = new TextField[labelsArray.length];


        for (int i = 0; i < labelsArray.length; i++) {
            labels[i] = new Label(labelsArray[i]);
            textFields[i] = new TextField(textArray[i]);
        }

        // center element of BorderPane configuration
        GridPane centerGPane = new GridPane();
        centerGPane.setAlignment(Pos.TOP_LEFT);
        centerGPane.setVgap(10);
        centerGPane.setHgap(10);

        centerGPane.add(chooseRaceText, 0,0);
        for (int i = 0; i < raceRadioButton.length; i++) {
            if(i < 3) centerGPane.add(raceRadioButtons[i], 0, i + 1);
            else if( i < 6) centerGPane.add(raceRadioButtons[i], 1, i - 2);
            else centerGPane.add(raceRadioButtons[i], 2, i - 5);
        }

        for (int i = 0; i < labelsArray.length; i++) {
            centerGPane.add(labels[i], 0, i + 4);
            centerGPane.add(textFields[i], 1, i + 4);
        }
        // **********end config for CENTER BORDERPANE


        // **********start config for BOTTOM BORDERPANE
        // buttons for display in bottom BorderPane
        for (int i = 0; i < buttonsArray.size(); i++) {
            buttons[i] = new Button(buttonsArray.get(i));
            buttons[i].setMinWidth(buttonSize);
        }

        // bottom element of BorderPane configuration (buttons)
        GridPane bottomGPane = new GridPane();
        bottomGPane.setAlignment(Pos.TOP_CENTER);
        bottomGPane.setVgap(10);
        bottomGPane.setHgap(10);
        for (int i = 0; i < buttonsArray.size(); i++) {
            bottomGPane.add(buttons[i], 0, i);
        }

        // **********end config for BOTTOM BORDERPANE

        // Add GridPane elements to BorderPane
        bPane.setTop(topGPane);
        bPane.setCenter(centerGPane);
        bPane.setBottom(bottomGPane);

        // Stage configuration, add BorderPane to Stage, show Stage
        primaryStage.setTitle(screenTitle);
        primaryStage.setScene(new Scene(bPane, screenWidth, screenHeight)); // iPhone 10x dimensions
        primaryStage.show();

        // event handling for the screen
        buttons[0].setOnAction(actionEvent -> {
            try {
                System.out.println("Save action not developed yet");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        buttons[1].setOnAction(actionEvent -> {
            try {
                LaunchScreen.showScreen(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
