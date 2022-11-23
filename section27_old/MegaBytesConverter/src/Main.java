public class Main {
    public static void main(String[] args) {
        pPrintMegaBytesAndKiloBytes(2545);
    }

    public static void pPrintMegaBytesAndKiloBytes(int pKiloBytes) {
        if (pKiloBytes < 0) {
            System.out.println("invalid value");
        } else {
            double conversionMega=pKiloBytes/1024;
            double remainingKiloBytes = conversionMega%2;
            System.out.println(conversionMega);
            System.out.println(remainingKiloBytes);
//                System.out.println(kiloBytes + "KB = " + megaBytes + "MB" + " and " + remainingKiloBytes + "KB");

        }
    }
}