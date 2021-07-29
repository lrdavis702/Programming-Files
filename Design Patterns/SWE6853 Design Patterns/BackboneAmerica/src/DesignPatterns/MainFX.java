package DesignPatterns;

import DesignPatterns.AnnualRetreat.Retreat;
import DesignPatterns.AnnualRetreat.RetreatBuilder;
import DesignPatterns.Services.BBAService;
import DesignPatterns.Services.BusinessPlanning.BusinessPlanning;
import DesignPatterns.Services.Coaching.Coaching;
import DesignPatterns.Services.Coaching.Group.SingletonGroup;
import DesignPatterns.Services.EmployeeTraining.EmployeeTraining;
import DesignPatterns.Services.RecordedClasses.RecordedClasses;
import DesignPatterns.Services.ServiceFactory;
import DesignPatterns.UserRecord.LoginScreen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainFX extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("default.fxml"));
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);

        Label greeting = new Label("Welcome to Backbone America");
        root.getChildren().add(greeting);

        primaryStage.setTitle("Backbone America");
        primaryStage.setScene(new Scene(root, 300, 270));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        String[] welcomeArray = new String[]{"Coaching", "Business Planning",
                "Business Training", "Recorded Classes", "Annual Retreat"};
        String welcomeTitle = "Backbone America Services";
        char userChoice;
        BBAService services;

        System.out.println("Welcome to Backbone America");
        System.out.println("-Mission-");
        System.out.println("To provide access to capital and opportunities " +
                "through business coaching and consulting.");
        System.out.println("\n-Vision-");
        System.out.println("To see an America that provides equal opportunities " +
                "to all entrepreneurs.");

        LoginScreen.displayScreen();

        // allows users to select from a choice of menu options
        userChoice = PrintMenuFX.makeSelection(welcomeArray, welcomeTitle);
        String item;

        if (userChoice == '1') {
            String[] coachingArray = new String[]{"Breakthrough Laser Session", "Run a S.M.A.R.T. Business", "Your Roadmap to Success",
                    "Group: Run a S.M.A.R.T. Business"};
            String coachingTitle = "Business Development Coaching";

            System.out.println("""
                            |Individual Business Coaching offers entrepreneurs a    |
                            |very personalized and customized experience. We        |
                            |focus on the areas you’ve identified as most important |
                            |to you. These sessions are totally about you and what  |
                            |you need to move forward in your business or other     |
                            |areas.                                                 |
                            """);

            item = String.valueOf(PrintMenuFX.makeSelection(coachingArray, coachingTitle));

            // checks to see if user selected group coaching session
            if (item.equals("4")) {
                SingletonGroup singleGroup = SingletonGroup.getInstance();

                if (singleGroup.groupRegistration(item)) {
                    System.out.println("Selections saved.");
                }
                else {
                    System.out.println("Returning to main menue.");
                    userChoice = PrintMenuFX.makeSelection(welcomeArray, welcomeTitle);
                }
            }

            // displays invoice for coaching
                ServiceFactory coaching = new Coaching();
                services = coaching.orderService(item);
                services.toString();
        }

        if (userChoice == '2') {
            String[] planningArray = new String[]{"Business Plan Review",
                    "Financial Projections", "Standard Funding", "Accelerated Funding"};
            String planningTitle = "Business Plan Services";

            System.out.println("""
                            |You need to know that companies with business plans are |
                            |twice as likely to succeed. Considering the challenges  |
                            |of starting, running, and growing a profitable business,|
                            |you want to have a business plan that’ll double your    |
                            |chances of developing a healthy business. Doesn't the   |
                            |time, effort, money, and resources you put into your    |
                            |company deserve a return on investment? Well, you       |
                            |increase your odds with a business plan.                |
                            """);

            item = String.valueOf(PrintMenuFX.makeSelection(planningArray, planningTitle));

            ServiceFactory planning = new BusinessPlanning();
            services = planning.orderService(item);
            services.toString();
        }

        if (userChoice == '3') {
            String[] trainingArray = new String[]{"Microsoft Office: Word", "Microsoft Office: Excel",
                    "Microsoft Office: PowerPoint", "WordPress", "Business Financial Performance"};
            String trainingTitle = "Employee Training";


            System.out.println("""
                            |Let’s talk about your training needs. I offer a        |
                            |30-minute Consultation to determine if I’m the right   |
                            |fit for your training needs. If the training you desire|
                            |isn’t listed, contact me anyway. It may be a service I |
                            |can still provide. Or I may be able to refer you to an |
                            individual or organization that can meet your needs.|
                            """);


            item = String.valueOf(PrintMenuFX.makeSelection(trainingArray, trainingTitle));

            ServiceFactory training = new EmployeeTraining();
            services = training.orderService(item);
            services.toString();
        }

        if (userChoice == '4') {
            String[] classesArray = new String[]{"31-Day Business Startup Challenge", "Map Your Business Success", "Mini Marketing Course",
                    "Reveal Your Marketing Strategy"};
            String classesTitle = "Self-Paced Business Classes";

            System.out.println("""
                            |When it comes to running a business, schedules can be  |
                            |unpredictable. Don't let the unknown keep you from     |
                            |achieve the results you want in your business. Sign up |
                            |for a self-paced course and take your business to the  |
                            |next level.                                            |
                            """);

            item = String.valueOf(PrintMenuFX.makeSelection(classesArray, classesTitle));

            ServiceFactory classes = new RecordedClasses();
            services = classes.orderService(item);
            services.toString();
        }

        if (userChoice == '5') {
            System.out.println("""
                            |Join fellow entrepreneurs ini this business changing          |
                            |experience, while learning new skills you can use in your     |
                            |business. As an added bonus, choose between one three options |
                            |to explore the city. You work hard and deserve it!            |
                            """);

            // builds retreat based on user selection
            RetreatBuilder retreatBuilder = new RetreatBuilder();

            Retreat newRetreat = retreatBuilder.prepareRetreat();
            System.out.println("Printing Retreat");
            newRetreat.showItems();
            System.out.println("Total Cost: $" + newRetreat.getCost());
        }
    }
}