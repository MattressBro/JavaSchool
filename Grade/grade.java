//Braden Heeney
//For Loop program
// 7/7/2024
//CSC320-1
import java.util.Scanner;

public class grade{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Grade Calculation");
        System.out.println("=================");
        int[] numbers = new int[10];
        int max=0;
        int min=100;
        int totalCount=0;
        for (int i=0; i < 10; i++){
            System.out.print("Please enter grade: ");
            if(s.hasNextInt()){
                numbers[i] = s.nextInt();
            }
            else{
                System.out.println("Error: "+s.next()+" is not a valid reponse");
                i--;
            }
            totalCount += numbers[i];
            if(numbers[i] > max)
                max = numbers[i];
            else if(numbers[i] < min)
                min = numbers[i];
        }
        System.out.println();
        System.out.println("Average: "+totalCount/10);
        System.out.println("Maximum: "+max);   
        System.out.println("Minimum: "+min);  
    }
}
