public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count=0;
        for(int i=1; i<1001;i++){
            if (i%3==0&&i%5==0){
                sum+=i;
                count++;
                System.out.println("condition met: " + i);
            }
            if (count==5){
                break;
            }
        }
        System.out.println(sum);
}}