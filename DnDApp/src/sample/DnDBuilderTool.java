// @author L. Renee Davis
// @file DnDBuilderTool.java
// @brief A program that creates characters and campaigns for the game Dungeons & Dragons
// @version Date: 2021-08-03
// Started Application: D&D Builder Tool. Created Main Screen, Character Screen, and shell classes for Character Screen
// subclasses (AutoCharacter, CharacterScreen, CharacterSteps, DelCharacter, LoadCharacter, ModCharacter) using JavaFx.
// Step4Description, Step5Equipment, Step6Team). Created Constructors for Created constructors for Race, Class,
// AbilityScores, Classes, Equipment, Equipment Subtypes, TeamMembers
// @version Date: 2021-08-04
// Refractored Classes to use a common Class (ConfigurePage) to create screens, which reduced code redundancies.
// created LaunchScreen,
// @version date: 2021-08-06
// Created construtor for PageDimensions to use across application. Created shell Classes for character creation steps
// (Step1Race, Step2Class, Step3AbilityScores, Step4Description, Step5Equipment, Step6Team). Updated comments in classes
// Renamed tool from Main to DnDBuilderTool. Began coding Frontend of Step1Race page. Updated comments to include
// descriptions of classes

package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class DnDBuilderTool extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        LaunchScreen.showScreen(primaryStage); // launches startup screen
    }
    public static void main(String[] args) {
        launch(args);
    }
}