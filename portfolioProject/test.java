package portfolioProject;
import java.util.ArrayList;
import java.util.Scanner;
public class test {

    public static void main(String[] args){
        //VehicleInventory autoInventory = new VehicleInventory();
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
        System.out.println(" Vehicle Inventory Manager ");
        System.out.println("==============================");
        System.out.println();
        int choice=0;
        Scanner s = new Scanner(System.in);
        while(choice !=6){
            System.out.println("           Main Menu          ");
            System.out.println("1:View Inventory");
            System.out.println("2:Add Vehicle to Inventory");
            System.out.println("3:Remove Vehicle from Inventory");
            System.out.println("4:Edit Vehicle Information");
            System.out.println("5:Export Inventory");
            System.out.println("6:Quit");
            System.out.println("");
            System.out.print("Enter Selection: ");
            choice = parse(s.next());
            System.out.println("");
            switch (choice) {
                case 1: 
                    System.out.println("View Inventory:");
                    displayInventory(inventory);
                    break;
                case 2: 
                    System.out.println("Add Vehicle to Inventory:");
                    addAuto(inventory);
                    break;
                case 3: 
                    System.out.println("Remove Vehicle from Inventory:");
                    removeAuto(inventory);
                    break;
                case 4:
                    System.out.println("Edit Vehicle Information:");
                    editAuto(inventory);
                    break;
                default:
                    System.out.println("Invalid Response");
                    
            }

        }
    
        
    }
 
    public static int parse(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Response");
            return 9999;
        }
    }
    public static void displayInventory(ArrayList<Vehicle> inventory){
        if(inventory.size()==0){
            System.out.println("No current inventory");
            System.out.println("");
        }
        for(int i=0; i < inventory.size(); i++){
            System.out.println("#"+(i+1));
            inventory.get(i).displayInformation();
        }
    }
    public static void addAuto(ArrayList<Vehicle> inventory){
        Scanner input = new Scanner(System.in);
        System.out.print("   Make: ");
        String make = input.next().toUpperCase();
        System.out.print("  Model: ");
        String model = input.next().toUpperCase();
        
        System.out.print("  Color: ");
        String color = input.next().toUpperCase();
        
        System.out.print("   Year: ");
        int year = parse(input.next());
        System.out.print("Mileage: ");
        int mileage = parse(input.next());
        inventory.add(new Vehicle(make,model,color,year,mileage));
        
    }
    public static void removeAuto(ArrayList<Vehicle> inventory){
        Scanner input = new Scanner(System.in);
        if(inventory.size()==0){
            System.out.println("No current inventory");
            System.out.println("");
        }
        else{
            for(int i=0; i < inventory.size(); i++){
                System.out.println("#"+(i+1));
                inventory.get(i).displayInformation();
            }
            System.out.print("Remove #: ");
            int choice = input.nextInt();
            System.out.println(inventory.get(choice-1).getMake()+" "+inventory.get(choice-1).getModel()+" has been removed");
            inventory.remove(choice-1);
        }
    }
 
    public static void editAuto(ArrayList<Vehicle> inventory){
        Scanner input = new Scanner(System.in);
        if(inventory.size()==0){
            System.out.println("No current inventory");
            System.out.println("");
        }
        else{
            for(int i=0; i < inventory.size(); i++){
                System.out.println("#"+(i+1)+" "+inventory.get(i).getMake()+" "+inventory.get(i).getModel());
            }
            System.out.print("Edit Vehicle #: ");
            int choice = input.nextInt()-1;
            inventory.get(choice).displayInformation();
            System.out.print("Make:    ");
            inventory.get(choice).setMake(input.next().toUpperCase());
            System.out.print("Model:   ");
            inventory.get(choice).setModel(input.next().toUpperCase());
            System.out.print("Color:   ");
            inventory.get(choice).setColor(input.next().toUpperCase());
            System.out.print("Year:    ");
            inventory.get(choice).setYear(parse(input.next()));
            System.out.print("Mileage: ");
            inventory.get(choice).setMileage(parse(input.next()));
            System.out.println();
            System.out.println("Information has been updated");
            inventory.get(choice).displayInformation();
        }
    }
}
