import java.util.Random;
import java.util.Scanner;

public class affrinbe {


    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        //Ask the user for how many passwords they want and the length of
        // passwords
        System.out.print("How many random passwords do you want generated? ");
        int total = in.nextInt();
        System.out.print("How many characters long do you want your random passwords to be? ");
        int length = in.nextInt();
        System.out.println();
        //create array to store random passwords
        String[] randomPasswords = new String[total];

        //loop through total number of passwords
        for (int i = 0; i < total; i++) {
            //Generate one random passwords
            String randomPassword = " ";
            for (int j = 0; j < length; j++) {
                //Generate one random character
                randomPassword += randomCharacter();
            }
            //Add our random passwords to the array
            randomPasswords[i] = randomPassword;
        }

        //print out array of passwords
        printPasswords(randomPasswords);

        //print out password password strength
        System.out.println(getPasswordStrength(length));

    }

    public static String getPasswordStrength(int length) {
        if (length < 5) {
            return "weak";
        } else if (length < 10) {
            return "medium";
        } else {
            return "strong";
        }
    }

    public static void printPasswords(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    //'0'-'9'=>48-57 in ASCII
    //'A'-'Z'=>65-90 in ASCII
    //'a'-'z'=>97-122 in ASCII
    public static char randomCharacter() {

        //Generate a random number that represents all possible characters in our password
        //10 digits + 26 uppercase letters + 26 lowercase letters + 62 possible characters
       // int rand = (int) (Math.random() + 62);
        //Break up read into intervals to represent numbers, uppercase letters and lower
        // case letters
        //rand is between 0-61 inclusive
        //if rand is between 0-9=>number
        //if rand is between 10-35=>uppercase
        //if rand is between 36-61=>lowercase

//            if(rand <= 9) {
//                //number rand is between 0-9=>48-57 in ASCII
//                int ascii = rand + 48; //48-0=48
//                return (char) (ascii);
//            }else if(rand <=35) {
//                //uppercase letter:rand is between 10-35=>65-90 in ASCII
//                int ascii = rand + 55;//65-10=55
//                return (char) (ascii);
//            }else{
//                //lowercase letter: rand is between 36-61=>97-122 in ASCII
//                int ascii=rand =61;//97-36=61
//                return(char)(ascii);
//            }
        Random ram=new Random();
        int ka=ram.nextInt(0xB4 - 21+1);
        return (char) ka;

    }
}