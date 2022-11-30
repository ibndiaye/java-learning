public class Main {
    public static void main(String[] args) {
//        tests
        //        System.out.println("0 is " + (isPrime(0) ? "" : "NOT") + "a prime number");
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT") + "a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT") + "a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT") + "a prime number");
//
//        System.out.println("8 is " + (isPrime(8) ? "" : "NOT") + "a prime number");
//        System.out.println("17 is " + (isPrime(17) ? "" : "NOT") + "a prime number");

        int primeCounter = 0;
//        for (int i = 0; primeCounter <3&&i < 100; i++) -> need to remove if block that checks for primCounter == 3
        for (int i = 0; i < 100; i++) {
            if (i <= 1000) {
                System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + "a prime number");
                primeCounter++;
//                System.out.println(primeCounter);
                if (primeCounter == 3){
                    System.out.println("found 3, exiting loop");
                    break;
                }
            }

        }
//        System.out.println("total of prime numbers:" + primeCounter);


    }

    public static boolean isPrime(int pWholeNumber) {
        if (pWholeNumber <= 2) {
            return pWholeNumber == 2;
        }

        for (int divisor = 2; divisor < pWholeNumber; divisor++) {
            if (pWholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
