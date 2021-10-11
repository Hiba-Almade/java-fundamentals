
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(3);
        clock();
    }

    static String pluralize(String x, int y){
        if(y > 1 || y==0){
            return x+"s";
        }else{
            return x;
        }

    }

    static void flipNHeads(int n){
        int numOfFlip=0;
        int numOfHeads=0;
        double randomNum;
        while (numOfHeads != n ){
            randomNum = Math.random();
            numOfFlip ++ ;
            if(randomNum < 0.5){
                System.out.println("tails");
                numOfHeads=0;
            }else {
                System.out.println("heads");
                numOfHeads ++;
            }
        }
        System.out.println("It took " +numOfFlip+" flips to flip "+ numOfHeads+" head in a row.");

    }

    static void clock(){
        LocalDateTime time = LocalDateTime.now();
        while (true){
            LocalDateTime newTime = LocalDateTime.now();
            if(time.getSecond() != newTime.getSecond()){
              time=newTime;
                String printTime = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(printTime);
            }
        }
    }
}
