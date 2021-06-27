package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class CalendarClass {

        public static void main(String[] args) {

            Date now = new Date();
            System.out.println(now);

            Calendar cal = Calendar.getInstance();
            System.out.println(cal);

            // creating Date object using Calendar instance/object
            Date fromCal = cal.getTime();
            System.out.println(fromCal);


            Date convertedDate = null;
            String dateText = "April 02 2021, 19:00:00";
            SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM dd yyyy, HH:mm:ss");

            try {
                convertedDate = sdf2.parse(dateText);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            System.out.println("Converted Date --> " + convertedDate);  // Fri Apr 02 19:00:00 EDT 2021

            // Setting Calendar using Date object
            cal.setTime(convertedDate);
            System.out.println(cal);

            // Add 4 days in the cal
            cal.add(Calendar.DATE, 4);

            System.out.println("\n"+cal);


            System.out.println(cal.getTime());  // April 6

            cal.add(Calendar.DATE, -10);

            System.out.println("\n"+cal);       // march 27


            cal.add(Calendar.MONTH, -5);    // Oct 27, 2020
            cal.add(Calendar.YEAR, 10);     // Oct 27, 2030

            System.out.println(cal.getTime());      // Oct 27, 2030

            /**
             * print the current time as 9:32 PM
             * BUT, you cannot create Date object
             */
            Calendar currentCalender = Calendar.getInstance();
            SimpleDateFormat df = new SimpleDateFormat("h:mm a");

            String formattedCurrentTime = df.format(currentCalender.getTime());

            System.out.println("\n\n" + formattedCurrentTime);




        }


    }

