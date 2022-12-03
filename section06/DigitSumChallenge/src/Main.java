public class Main {
    public static void main(String[] args) {
            int value= sumDigits(125);
        System.out.println(value);
    }

    public static int sumDigits(int pNumber){
        int result=0;
        if (pNumber>=0){
            while (pNumber>9){
                result+=(pNumber%10);
                pNumber/=10;
            }
            result+=pNumber;
        }else {
            return -1;
        }
        return result;
    }
}
