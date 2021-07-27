package DesignPatterns;

import DesignPatterns.Services.BusinessPlanning.BusinessPlanning;
import DesignPatterns.Services.Coaching.Coaching;
import DesignPatterns.Services.Coaching.Group.SingletonGroup;
import DesignPatterns.Services.EmployeeTraining.EmployeeTraining;
import DesignPatterns.Services.RecordedClasses.RecordedClasses;
import DesignPatterns.AnnualRetreat.Retreat;
import DesignPatterns.AnnualRetreat.RetreatBuilder;
import DesignPatterns.Services.BBAService;
import DesignPatterns.Services.ServiceFactory;
import DesignPatterns.UserRecord.LoginScreen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] welcomeArray = new String[]{"Coaching", "Business Planning",
                "Business Training", "Recorded Classes", "Annual Retreat"};
        String welcomeTitle = "Backbone America Services";
        char userChoice;

        BBAService services = null;

        System.out.println("Welcome to Backbone America");
        System.out.println("-Mission-");
        System.out.println("To provide access to capital and opportunities " +
                "through business coaching and consulting.");
        System.out.println("\n-Vision-");
        System.out.println("To see an America that provides equal opportunities " +
                "to all entrepreneurs.");

        LoginScreen.displayScreen();

        userChoice = PrintMenu.makeSelection(welcomeArray, welcomeTitle);
        String item;

        if (userChoice == '1') {
            String[] coachingArray = new String[]{"Breakthrough Laser Session", "Run a S.M.A.R.T. Business", "Your Roadmap to Success",
                    "Group: Run a S.M.A.R.T. Business", "Group: Your Roadmap to Success"};
            String coachingTitle = "Business Development Coaching";

            System.out.println(
                    "|Individual Business Coaching offers entrepreneurs a    |\n" +
                    "|very personalized and customized experience. We        |\n"+
                    "|focus on the areas you’ve identified as most important |\n" +
                    "|to you. These sessions are totally about you and what  |\n" +
                    "|you need to move forward in your business or other     |\n" +
                    "|areas.                                                 |\n");

            item = String.valueOf(PrintMenu.makeSelection(coachingArray, coachingTitle));

            if (item.equals("4") || item.equals("5")) {
                SingletonGroup singleGroup = SingletonGroup.getInstance();

                if (singleGroup.groupRegistration(item)) {
                    ServiceFactory coaching = new Coaching();
                    services = coaching.orderService(item);
                    services.toString();
                }
            }
            ServiceFactory coaching = new Coaching();
            services = coaching.orderService(item);
            services.toString();
        }

        if (userChoice == '2') {
            String[] planningArray = new String[]{"Business Plan Review",
                    "Financial Projections", "Standard Funding", "Accelerated Funding"};
            String planningTitle = "Business Plan Services";

            System.out.println(
                    "|You need to know that companies with business plans are |\n" +
                            "|twice as likely to succeed. Considering the challenges  |\n" +
                            "|of starting, running, and growing a profitable business,|\n" +
                            "|you want to have a business plan that’ll double your    |\n" +
                            "|chances of developing a healthy business. Doesn’t the   |\n" +
                            "|time, effort, money, and resources you put into your    |\n" +
                            "|company deserve a return on investment? Well, you       |\n" +
                            "|increase your odds with a business plan.                |\n");

            item = String.valueOf(PrintMenu.makeSelection(planningArray, planningTitle));

            ServiceFactory planning = new BusinessPlanning();
            services = planning.orderService(item);
            services.toString();
        }

        if (userChoice == '3') {
            String[] trainingArray = new String[]{"Microsoft Office: Word", "Microsoft Office: Excel",
                    "Microsoft Office: PowerPoint", "WordPress", "Business Financial Performance"};
            String trainingTitle = "Employee Training";


            System.out.println(
                    "|Let’s talk about your training needs. I offer a        |\n" +
                            "|30-minute Consultation to determine if I’m the right   |\n" +
                            "|fit for your training needs. If the training you desire|\n" +
                            "|isn’t listed, contact me anyway. It may be a service I |\n" +
                            "|can still provide. Or I may be able to refer you to an |\n" +
                            "individual or organization that can meet your needs.|\n");


            item = String.valueOf(PrintMenu.makeSelection(trainingArray, trainingTitle));

            ServiceFactory training = new EmployeeTraining();
            services = training.orderService(item);
            services.toString();
        }

        if (userChoice == '4') {
            String[] classesArray = new String[]{"31-Day Business Startup Challenge", "Map Your Business Success", "Mini Marketing Course",
                    "Reveal Your Marketing Strategy"};
            String classesTitle = "Self-Paced Business Classes";


            System.out.println(
                    "|When it comes to running a business, schedules can be  |\n" +
                            "|unpredictable. Don't let the unknown keep you from     |\n" +
                            "|achieve the results you want in your business. Sign up |\n" +
                            "|for a self-paced course and take your business to the  |\n" +
                            "|next level.                                            |\n");

            item = String.valueOf(PrintMenu.makeSelection(classesArray, classesTitle));

            ServiceFactory classes = new RecordedClasses();
            services = classes.orderService(item);
            services.toString();
        }

        if (userChoice == '5') {
            System.out.println(
                    "|Join fellow entrepreneurs ini this business changing          |\n" +
                            "|experience, while learning new skills you can use in your     |\n" +
                            "|business. As an added bonus, choose between one three options |\n" +
                            "|to explore the city. You work hard and deserve it!            |\n");

            RetreatBuilder retreatBuilder = new RetreatBuilder();
            Retreat newRetreat = retreatBuilder.prepareRetreat();

            System.out.println(newRetreat);
            newRetreat.showItems();
            System.out.println("Total Cost: " + newRetreat.getCost());
        }
    }
}