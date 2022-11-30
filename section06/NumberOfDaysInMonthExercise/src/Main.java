public class Main {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int pYear) {
        boolean isLeapYr = false;
        if (pYear >= 1 && pYear <= 9999) {
            if (pYear % 400 == 0) {
                isLeapYr = true;
            }
        } else {
            return false;
        }
        return isLeapYr;
    }

    public static int getDaysInMonth(int pMonth, int pYear) {
        int leapYear=0;
        if (pMonth < 1 || pMonth > 12||pYear<1||pYear>9999) {
            return -1;
        }else {
            if (pYear >= 1 && pYear <= 9999) {
                if (pYear % 400 == 0) {
                    leapYear=1;
                }
            } else {
                leapYear=0;
            }

            switch(leapYear){
                case 1->;
            };
        }

    }
}
