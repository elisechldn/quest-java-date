import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line
        //Using a GregorianCalendar class in order to instanciate a date chosen by the User
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        
        //We retrieve the day chosen by the user in order to know the exact day of that particular week
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        //Date has been formatted using the class SDF in order to only get the informations we need (not the time)
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");

        //We are applying the format on the data contained in calendar
        String dateString = format.format(calendar.getTime());

        //try&catch is mandatory while using SDF
        try {
            
            /*dateString = str under MM-dd-yyyyparse = Method from Date. Convert Str to Obj
            format.parse() = method from Date used to analyze the Str. If the Str is correctly written
            it becomes an Obj held in concatDate */
            Date concatDate = format.parse(dateString);
            System.out.println("The date is : " + format.format(concatDate)); 
            System.out.println("The day of week is : " + dayOfWeek);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}