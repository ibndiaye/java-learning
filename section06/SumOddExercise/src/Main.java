public class Main {
    public static void main(String[] args) {
        int value = sumOdd(100, 1000);
        System.out.println(value);
    }

    public static boolean isOdd(int pNumber) {
        if (pNumber < 0) {
            return false;
        } else if (pNumber % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int pStart, int pEnd) {
        int sum = 0;
        if (pEnd >= pStart && pStart > 0 && pEnd > 0) {
            for (pStart = pStart; pStart < pEnd + 1; pStart++) {
                if (isOdd(pStart)) {
                    sum += pStart;
                }

            }
        } else {
            return -1;
        }

        return sum;
    }
}
