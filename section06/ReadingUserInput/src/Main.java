import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int pCurrentYear) {
        String name = System.console().readLine("hi whats your name? ");
        System.out.println("hi " + name);
        String dateOfBirth = System.console().readLine("what year were you born? ");
        int age = pCurrentYear - Integer.parseInt(dateOfBirth);
        return "so you are " + age;
    }

    public static String getInputFromScanner(int pCurrentYear) {
        Scanner scanner = new Scanner(System.in);
//        String name = System.console().readLine("hi whats your name? ");
        System.out.println("hi, whats your name? ");
        String name = scanner.nextLine();
        System.out.println("hi " + name);
//        String dateOfBirth=System.console().readLine("what year were you born? ");
        System.out.println("what year were you born? ");

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("enter a year of birth >= " + (pCurrentYear - 125) + " and <= " + pCurrentYear);
            try {
                age = checkData(pCurrentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch(NumberFormatException badUserData){
                System.out.println("characters not allowed");
            }
        } while (!validDOB);

        return "so you are " + age;
    }

    public static int checkData(int pCurrentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minyear = pCurrentYear - 125;

        if ((dob < minyear) || (dob > pCurrentYear)) {
            return -1;
        }
        return pCurrentYear - dob;
    }
}