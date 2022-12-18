import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min =0;
        double max=0;
        int loopCount=0;

        while (true){
            System.out.println("Enter a number or character to exit:");
            String nextEntry= scanner.nextLine();
            try {
                double entry = Double.parseDouble(nextEntry);
                if (loopCount == 0 || entry < min){
                    min = entry;
                }
                if (loopCount == 0 || entry > min){
                    max = entry;
                }
                loopCount++;
            } catch (NumberFormatException nfe){
                break;
            }
        }
        if (loopCount > 0){
            System.out.println("min: "+min+" and max: " +max);
        } else{
            System.out.println("no valid data entered");
        }
    }
}