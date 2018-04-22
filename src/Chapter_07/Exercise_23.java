package Chapter_07;

/**
 * Chapter 7 Exercise 23:
 *
 *      (Game: locker puzzle) A school has 100 lockers and 100 students.
 *      All lockers are closed on the first day of school. As the students enter,
 *      the first student, denoted S1, opens every locker. Then the second student,
 *      S2, begins with the second locker, denoted L2, and closes every other locker.
 *      Student S3 begins with the third locker and changes every third locker
 *      (closes it if it was open, and opens it if it was closed). Student S4 begins
 *      with locker L4 and changes every fourth locker. Student S5 starts with L5 and
 *      changes every fifth locker, and so on, until student S100 changes L100.
 *      After all the students have passed through the building and changed the lockers,
 *      which lockers are open? Write a program to find your answer and display all open
 *      locker numbers separated by exactly one space.
 *
 *      (Hint: Use an array of 100 Boolean elements, each of which indicates whether a locker is open (true) or closed (false). Initially, all lockers are closed.)
 *       Created by Luiz Arantes Sa on 8/28/14.
 */
public class Exercise_23 {
     public static void main(String[] args) {
        boolean[] lockers = new boolean[101];
        //Open all multiples of 1 before moving on to 2
        for (int i = 1; i < lockers.length; i++) {
            lockers[i] = true;
        }


        //open every locker for every multiple of i
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; i * j <= 100; j++) {
                lockers[i * j] = (lockers[i * j] == true) ? false : true;
            }
        }

        //Display the indices of the open lockers
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i] == true)
                System.out.println("locker " + i + " is open.");
        }
    }
}
