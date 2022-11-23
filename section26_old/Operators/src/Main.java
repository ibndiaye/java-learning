public class Main {
    public static void main(String[] args) {
        int result= 1+2; // 1 +2 = 3
        System.out.println("1+2= " + result);
        int prevResult=result;
        System.out.println(prevResult);
        result=result-1; //3-1=2
        System.out.println(result);
        System.out.println(prevResult);

        result=result*10;//2*10
        System.out.println(result);

        result=result/5; //20/5=4
        System.out.println(result);

        result=result%3;//1
        System.out.println(result);

        //resut=result+1;
        result++; //1+1=2
        System.out.println(result);

        result--;
        System.out.println(result);

        //result=result+1;
        result+=2;
        System.out.println(result);

        //result=result*10;
        result*=10; //3*10
        System.out.println(result);

        //result=result/3;
        result/=3;
        System.out.println(result);

        //result=result-2;
        result-=2;
        System.out.println(result);

        boolean isAlien=false;
        if (isAlien==false) {
            System.out.println("not an alien!");
            System.out.println("and im scared of aliens");
        }

        int topScore=80;
        if (topScore<100){
            System.out.println("you got the high score");
        }

        int secondTopScore=81;
        if ((topScore>secondTopScore) && (topScore <100)){
            System.out.println("greater than topscore and less 100");
        }

        if ((topScore>90) || (secondTopScore <=90)){
            System.out.println("either or both of the conditions are true");
        }

        int newValue=50;
        if (newValue==50){
            System.out.println("this is true");
        }

        boolean isCar=false;
        if(isCar){
            System.out.println("this is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }
    }
}