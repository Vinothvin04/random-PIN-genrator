import java.util.Random;
import java.util.Scanner;

public class random_num {

    public  void random_num_mehod(){

        Random vrandom = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("how much random numbers you need : ");
        int j = input.nextInt();

        System.out.println("Random number under :");
        int jv = input.nextInt();
        System.out.println("Random number from : ");
        for(int i = input.nextInt(); i<=j;i++){
            System.out.println(vrandom.nextInt(jv) +1);



        }




    }

}
