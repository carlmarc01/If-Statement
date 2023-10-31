import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) throws Exception {
        
        int score;
        Scanner s = new Scanner (System.in);
        System.out.println("What is your Score?");
        score = s.nextInt();     
       
        if ( score>= 75 && score <= 80) {
            System.out.println("Fortunately, you passed!.");
        }
        else if (score > 81  && score < 90 ){
            System.out.println("You are doing great!");
        }
        else if( score > 90){
            System.out.println("You are a prodigy!");
        }
        else{
            System.out.println("Let's try it again!");
        }

    }
}
