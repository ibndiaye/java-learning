import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum =0;
        while(counter<=5){
            System.out.println("enter number #"+counter+":" );
            String nextnumber = scanner.nextLine();
            try{
                double nextNumberInt=Double.parseDouble(nextnumber);
                counter++;
                sum+=nextNumberInt;
            }catch (NumberFormatException e){
                System.out.println("invalid entry");
            }
        }
        System.out.println("Sum: " + sum);
    }

}