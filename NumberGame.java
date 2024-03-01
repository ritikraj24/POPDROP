import java.util.Scanner;
import java.util.Random;

class Game{
    public int number;
    public int inputnumber;

    public int noOfGuess=0;

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    public int getNoOfGuess() {
        return noOfGuess;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuess++;
        if(inputnumber==number){
//            System.out.format("Yes, you guessed it right, it was %d\n You guessd it in %d attempts",number,noOfGuess);
            System.out.println("Yes, you guessed it right "+ number);
              System.out.println("You guessed it in "+ noOfGuess +" attempts");
            return true;
        }
        else if (inputnumber<number) {
            System.out.println("Too low...");
        }
        else if (inputnumber>number) {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class NumberGame {
    public static void main(String[] args) {
      Game g=new Game();
      boolean b=false;
      while(!b){
          g.takeUserInput();
          b= g.isCorrectNumber();
      }
    }
}
