public class Main {
    public static void main(String[] args) {
//        int value=3;
//        if  (value==1){
//            System.out.println("value was 1");
//        }else if (value==2){
//            System.out.println("value was 2");
//        }else{
//            System.out.println("was not 1 or 2 ");
//        }

        int switchValue = 2;
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 4, 5, 6 -> {
                System.out.println("was a 4,5 or a 6");
                System.out.println("actually it was " + switchValue);
            }
            default -> System.out.println("was not 1,2,4,5 or 6  ");
        }
        String month="xyz";
        System.out.println(month+ " -> "+ getQuarter(month));
    }

    public static String getQuarter(String pMonth){
        return switch (pMonth) {
            case "JANAUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse=pMonth+" is bad";
                yield badResponse;
            }
        };

    }

}
