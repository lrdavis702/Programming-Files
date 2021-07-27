package DesignPatterns.Services.Coaching.Group;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class SingletonGroup {
    Scanner input = new Scanner(System.in);

    private static SingletonGroup instance = new SingletonGroup();

    private SingletonGroup() {
    }

    public static SingletonGroup getInstance() {
        return instance;
    }

    public boolean groupRegistration(String item) {
        String answer;
        String pattern = "MMMM dd, yyyy";
        int futureWeek = 1;

        SimpleDateFormat sdf = new SimpleDateFormat(pattern, new Locale("en", "US"));
        if (item.equals("4")) {
            futureWeek = 1;
        } else if (item.equals("5")) {
            futureWeek = 2;
        }
        String registrationDate = sdf.format(getMonthWeek(futureWeek));


        System.out.println("The next group session for Your Roadmap to Success is scheduled for " + registrationDate +
                " at 8:00 am");

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

    public static Date getMonthWeek(int nextSat) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH, nextSat);
        cal.get((Calendar.DAY_OF_WEEK) - 1);
        int i = 1;
        while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
            cal.set(Calendar.DAY_OF_MONTH, i++);
        }
        Date firstMonday = cal.getTime();
        String dtStr = new SimpleDateFormat("yyyy-MM-dd").format(firstMonday);
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
