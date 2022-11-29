public class Main {
    public static void main(String[] args) {
        double test=convertToCentimeters(68);
        convertToCentimeters(5,8);

        System.out.println(test);
    }

    public static double convertToCentimeters(int pInches){
        double convToCentimeters=pInches/0.39370;
        return convToCentimeters;
    }

    public static double convertToCentimeters(int pHeightFeet ,int pHeightInches ){
        double inches=(pHeightFeet*12)+pHeightInches;
        double centimeters=convertToCentimeters((int) inches);
        System.out.println(pHeightFeet + " foot "+pHeightInches+" is "+inches+" inches and "+centimeters+" centimeters" );
        return 1;

    }

}