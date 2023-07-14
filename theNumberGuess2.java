package oops_concept;
import java.util.Scanner;



import java.util.Random;


public class theNumberGuess2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String begin="yes";
        int TotalScore=0,TotalTries=0;
        System.out.println();
        System.out.println("A number is chosen between 1 to 100 and you have to guess the number within 5 tries");
        while(begin.equals("yes")){
            int guess,i,k=5,tries=0,score=0;
            Random ra=new Random();
            int number=ra.nextInt(100);
            for(i=0;i<k;i++){
                System.out.println();
                System.out.println("Guess the number");
                 guess=sc.nextInt();
            if(number==guess){
                tries++;
                System.out.println("Congratulations you have guessed the right number");
                System.out.println();
                TotalTries+=tries;
                TotalScore+=score;
                System.out.println();
                System.out.println("Would you like to play again,Yes or No?");
                begin=sc.next().toLowerCase();
                break;



            }
            else if(number>guess && tries!=k-1){
                System.out.println("The number is greater than " +guess);
                System.out.println();
                score--;
                tries++;

            }
            else{
                System.out.println("The number is  less than "+ guess );
                System.out.println();
                score--;
                tries++;

            }
 

            }
            if(i==k){
                System.out.println("You have exhausted the total number of tries");
                System.out.println("The number was "+number);
                TotalTries+=tries;
                TotalScore+=score;
                System.out.println();
                System.out.println("--------------------------");
                System.out.println("|  tries  |  score  |");
                System.out.println("---------------------------");
                System.out.println(" |    "+tries+"    |"+score+"    |");
                System.out.println("---------------------------");
                System.out.println();
                System.out.println("Would you like to play again,Yes or No?");
begin=sc.next().toLowerCase();


            }
            
           
    }
    System.out.println();
    System.out.println("               SCORECARD             ");
    System.out.println("---------------------------------------");
    System.out.println("|      total_tries   |         total_score      |");
    System.out.println("---------------------------------------");
    System.out.println("    |    "+TotalTries+"   |     "+TotalScore+"      |");
    System.out.println("----------------------------------------------------");
    System.out.println();

    



    
}


}
