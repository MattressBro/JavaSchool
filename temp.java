//Braden Heeney
//CSC320-1
//module 5 monthly temp assignment
import java.util.Scanner;
public class temp{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("2023 Norman, Oklahoma Average Temps");
        System.out.println("===================================");
        int choice=0;
        while(choice !=3){
            System.out.println("1: Select Month");
            System.out.println("2: Display Entire Year");
            System.out.println("3: Exit Program");
            System.out.println();
            System.out.print("Please enter your selection: ");
            String input = s.next();
            int[] temp = {40,44,53,62,70,79,84,83,74,63,51,41};
            String[] month = {"Janurary","Feburary","March","April","May","June","July","August","September","October","November","December"};
            try{
                choice = Integer.parseInt(input);
                if((choice == 1) || (choice ==2) || (choice == 3)){
                    if(choice ==1){
                        System.out.println("1: Janurary");
                        System.out.println("2: Feburary");
                        System.out.println("3: March");
                        System.out.println("4: April");
                        System.out.println("5: May");
                        System.out.println("6: June");
                        System.out.println("7: July");
                        System.out.println("8: August");
                        System.out.println("9: September");
                        System.out.println("10: October");
                        System.out.println("11: November");
                        System.out.println("12: December");
                        System.out.println("13: Return to menu");
                        System.out.println();
                        System.out.print("Please enter selection: ");
                        input = s.next();
                        int monthChoice;
                        try{
                            monthChoice = Integer.parseInt(input);
                            if((monthChoice > 0) && (monthChoice < 13)){
                                System.out.println("Month: "+month[monthChoice-1]);
                                System.out.println("Temp: "+temp[monthChoice-1]);
                                System.out.println();
                            }
                            else if(monthChoice ==13){
                                System.out.println();
                            }
                            else{
                                System.out.println("Error: Invalid Input");
                                System.out.println();
                            }
                        }catch(NumberFormatException e){
                            System.out.println("Error: Invalid Input");
                            System.out.println();
                        }
                    }
                    if(choice ==2){
                        for (int i=0; i < 12;i++){
                            System.out.printf("%-10s %s\n", month[i], temp[i]);
                        }
                        System.out.println();
                    }
                }
                else{
                    System.out.println("Error: Invalid Input");
                    System.out.println();
                }

            }catch(NumberFormatException e){
                System.out.println("Error: Invalid Input");
                System.out.println();
            }
        }
    }
}