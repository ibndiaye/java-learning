public class Challenge {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int pKiloBytes){
        if (pKiloBytes<0){
            System.out.println("Invalid Value");
        }else {
            int megaBytes=pKiloBytes/1024;
//            System.out.println(megaBytes);
            int remainingKb=pKiloBytes%1024;
//            System.out.println(remainingKb);
            System.out.println(pKiloBytes + "KB = " + megaBytes +
                    "MB and " + remainingKb + "KB");
        }

    }
}
