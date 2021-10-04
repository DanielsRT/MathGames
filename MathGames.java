import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/** This assignment is due by Tuesday, October 12th 11:59pm.  No late submissions! */

public class MathGames {
    public static void main(String[] args) {
        
        // TODO: 0 - How's your Java?
        // Many of the elementary school teachers in Jeanine's school still
        // use pencil and paper to log daily attendance.  They keep attendance
        // in a book where they list the date(s) of absences next to each
        // student's name.  For example, in the format 1234 10/4/2021 7/1/2021 6/30/2025
        // 
        // For this program, each entry in the attendance log has <M> <student ids>
        // followed by 0+ LocalDate objects.  Each row of the attendance log has a
        // <student id> (a unique 4-digit integer) followed by 0..10 randomly generated
        // absences per student.
        // 
        // Here is what the teachers need your app to do:
        // (a) Create a random student log of <M> <student ids> each having 0..10 absences.
        //   M, the student ids, the absence date(s), and the number of absences are all randomly
        //   generated.  All absences are in the range August 23rd, 2021 - April 25th, 2022
        //   and no absences on Saturdays or Sundays.
        // (b) How many absences does <student id> have?
        // (c) What day(s) of the week had the most absences?
        // (d) Students who miss more than 1 day in a week have detention.  How many
        // students had detention?

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");

        String earliestAsString = "8/23/2021";
        LocalDate earliestDate = LocalDate.parse(earliestAsString, formatter);
        System.out.println("\n\nThe earliest date is " + 
                            formatter.format(earliestDate));
        System.out.println(earliestAsString + " is on a " + earliestDate.getDayOfWeek());

        LocalDate today = LocalDate.now();
        LocalDate latestDate = LocalDate.of(2022, 04, 25);
        long daysBetween = ChronoUnit.DAYS.between(today, latestDate);
        System.out.printf("\nThere are %d days between %s and %s.\n", daysBetween, today, latestDate);
        System.out.printf("%d days earlier than %s is %s.\n", daysBetween, latestDate, latestDate.minusDays(daysBetween));


        // TODO: 1 - Move shortest to front and tallest to back
        // Given a list of <M> student heights (in  inches), move the shortest student to the
        // front of the list and the tallest student to the back of the list.  You cannot
        // rearrange any of the other heights and you can only traverse the list once.

        
        // TODO: 2 - What day of the year is your birthday?
        // Given a list of <M> student birth day (an integer in 1..366), by traversing the
        // list only once, how many students have birth days on each day.  For example, if
        // the room has 4 students with birth days 25, 132, 7, and 132 then one student was
        // born on Day 7, one student on Day 25, two students on Day 132, and every other
        // day has 0 student birth days.


        // TODO: 3 - Balance the seesaw
        // Given a list of weights, return the index (the fulcrum) where the average of the
        // values to the left are closest to the average of the values to the right.  The
        // value at the index should not be included in either average.
        // For example, the fulcrum for [7, 1, 4, 3] is 2.

        // TODO: 4 - Submit your zipped project folder (not individual files) to the
        // "Math Games" assignment in Google Classroom.
    }
    
}
