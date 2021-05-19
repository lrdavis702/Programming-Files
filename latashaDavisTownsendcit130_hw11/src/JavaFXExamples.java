// @author L. Renee Davis Townsend
// I pledge my word of honor that I have abided
// by the CSN Academic Integrity Policy while completing
// this assignment.
// @file JavaFXExamples.java
// @version The date as 2021-04-26
// @brief a program that uses a Pane, Scene, and Stage to
// demonstrate GUI
// @note 4 hours 30 minutes taken to develop, write, test and debug
// solution.

/* psuedocode

Start Method
   CREATE BorderPane
   INVOKE HBoxes
   CREATE Scene
   DISPLAY Scene

getHBox1 Method
   CREATE buttons
   CREATE labels
   CREATE HBox
   SET HBox properties
   ADD labels and buttons to HBox
   RETURN HBox

getHBox2 Method
   CREATE images
   CREATE HBox
   SET HBox properties
   ADD images to HBox
   RETURN HBox

getHBox3 Method
   CREATE circle1
   SET circle1 properties
   CREATE circle2
   SET circle2 properties
   CREATE rectangle1
   SET rectangle1 properties
   CREATE rectangle2
   SET rectangle2 properties
   CREATE HBox
   SET HBox properties
   ADD shapes to HBox
   RETURN HBox
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFXExamples extends Application {
   @Override // Override the start method in the Application class
   public void start(Stage primaryStage) {

      //creates pane1 and sets its property
      BorderPane pane1 = new BorderPane();
      pane1.setTop(getHBox1()); // Invokes HBox for for setting properties of labels and buttons
      pane1.setCenter(getHBox2()); // Invokes HBox for for setting properties of images
      pane1.setBottom(getHBox3()); // Invokes HBox for setting properties of shapes

      Scene scene = new Scene(pane1); // creates scene

      // sets properties for Stage and displays Stage
      primaryStage.setTitle("Latasha Renee Davis Townsend");
      primaryStage.setScene(scene);
      primaryStage.show();
   } // end start

   // Purpose: Creates and sets properties of buttons and labels
   // to the top of the BorderPane
   // Parameters: void
   // Returns: HBox
   private HBox getHBox1() {
      // declare and initializes buttons/labels
      Button button1 = new Button("Button 1");
      Button button2 = new Button("Button 2");
      Button button3 = new Button("Button 3");
      Label label1 = new Label("Label 1");
      Label label2 = new Label("Label 2");
      Label label3 = new Label("Label 3");

      // Creates and sets properties for GridPane
      GridPane gPane = new GridPane();
      gPane.setAlignment(Pos.CENTER);
      gPane.setHgap(10);
      gPane.setVgap(5.5);

      // Adds buttons and labels to GridPane
      gPane.add(label1, 0, 0);
      gPane.add(button1, 1, 0);
      gPane.add(label2, 0, 1);
      gPane.add(button2, 1, 1);
      gPane.add(label3, 0, 2);
      gPane.add(button3, 1, 2);

      // Creates and sets properties for HBox
      HBox hBox = new HBox(15);
      hBox.setPadding(new Insets(15, 15, 15, 15));

      // adds gPane to hBox layout
      hBox.getChildren().add(gPane);

      return hBox;
   }

   // Purpose: Creates and sets properties of the shapes in the middle
   // of the Border Pane
   // Parameters: void
   // Return: HBox
   private HBox getHBox2() {
      // creates red circle1 and sets its properties
      Circle circle1 = new Circle();
      circle1.setCenterX(100);
      circle1.setCenterY(100);
      circle1.setRadius(50);
      circle1.setStroke(Color.RED);
      circle1.setFill(Color.RED);

      // creates red circle2 and sets its properties
      Circle circle2 = new Circle();
      circle2.setCenterX(50);
      circle2.setCenterY(50);
      circle2.setRadius(10);
      circle2.setStroke(Color.RED);
      circle2.setFill(Color.RED);

      // creates blue rectangle1 and sets its properties
      Rectangle rectangle1 = new Rectangle(50, 20, 50, 50);
      rectangle1.setStroke(Color.BLUE);
      rectangle1.setFill(Color.BLUE);

      // creates blue rectangle2 and sets its properties
      Rectangle rectangle2 = new Rectangle(200, 200, 100, 30);
      rectangle2.setStroke(Color.BLUE);
      rectangle2.setFill(Color.BLUE);

      // Creates and sets properties of HBox
      HBox hBox = new HBox(15);
      hBox.setPadding(new Insets(15, 15, 15, 15));

      // adds the shapes to the hBox layout
      hBox.getChildren().addAll(circle1, circle2, rectangle1, rectangle2);

      return hBox;
   }

   // Purpose: Creates and sets properties of the images at the bottom
   // of the BorderPane
   // Parameters: void
   // Returns HBox
   private HBox getHBox3() {
      // declares and initializes images
      Image image1 = new Image("image1.jpeg");
      ImageView image2 = new ImageView("image2.jpeg");

      // Creates and sets properties for HBox
      HBox hBox = new HBox(15);
      hBox.setPadding(new Insets(15, 15, 15, 15));

      //adds images to hBox layout
      hBox.getChildren().addAll(new ImageView(image1), image2);

      return hBox;
   }
}