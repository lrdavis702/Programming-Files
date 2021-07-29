// Creates Singleton Class for Group Coaching
package DesignPatterns.Services.Coaching.Group;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class SingletonGroup {
    Scanner input = new Scanner(System.in);

    // creates an object of SingletonGroup
    private static SingletonGroup instance = new SingletonGroup();

    // constructor to prevent instantiation
    private SingletonGroup() {
    }

    // gets the object
    public static SingletonGroup getInstance() {
        return instance;
    }

    public boolean groupRegistration(String item) {
        String answer;
        String pattern = "MMMM dd, yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern, new Locale("en", "US"));

        // gets next date and formats it.
        String registrationDate = sdf.format(getMonthWeek());


        System.out.println("The next group session for Your Roadmap to Success is scheduled for " + registrationDate +
                " at 8:00 am");

        // Verifies users still wants to attend next date. If not, sends back to main menu
        do {
            System.out.println("Are you still interested in attending? (Y/N)");
            answer = input.nextLine();

            answer.toLowerCase();

            if (answer.charAt(0) == 'y') return true;
            else if (answer.charAt(0) == 'n') return false;
            else System.out.println("Please answer Y or N");
        } while (answer.charAt(0) != 'y' || answer.charAt(0) != 'n');
        return false;
    }

    // gets next group coaching session... first Saturday of month.
    public static Date getMonthWeek() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.get((Calendar.DAY_OF_WEEK) - 1);
        int i = 1;
        while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
            cal.set(Calendar.DAY_OF_MONTH, i++);
        }
        Date firstSaturday = cal.getTime();
        String dtStr = new SimpleDateFormat("yyyy-MM-dd").format(firstSaturday);
        String d = dtStr + " 20:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;

        try {
            date = sdf.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
