public class Main {
    public static void main(String[] args) {
        int number=4;
        int oddCount=0;
        int evenCount=0;

        while (number<21){
            number++;
            if (!isEvenNumber(number)){
                oddCount++;
                continue;
            }
            evenCount++;
            System.out.println(number);
            if (evenCount>=5){
                break;
            }
        }
        System.out.println("odd= "+oddCount);
        System.out.println("even= "+evenCount);
    }

    public static boolean isEvenNumber(int pNumber){
        if (pNumber%2==0){
            return true;
        }else {
            return false;
        }
    }
}
