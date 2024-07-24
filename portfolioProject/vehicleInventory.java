package portfolioProject;

//Braden Heeney
//Module 6 milestone portfolio project
//Submit document with methods for your Vehicle class, and pseudo code indicating functionality of each method.
/*import java.util.ArrayList;
public class VehicleInventory{
    private ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
    public VehicleInventory(){
        this.inventory = new ArrayList<>();
    }
    public void addAuto(Vehicle newAuto){
        inventory.add(newAuto);
    }
    public void removeAuto(Vehicle newAuto){
        inventory.remove(newAuto);
    }
    public void displayInventory(){
        if(inventory.size()==0){
            System.out.println("No current inventory");
        }
        for(int i=0; i < inventory.size(); i++){
            System.out.print(inventory.size()+": ");
            inventory.get(i).displayInformation();
        }
    }
}
*/
import java.util.Scanner;
import java.util.ArrayList;

public class VehicleInventory{
    private static ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
    private static String[] carInfo = {"Make", "Model", "Color", "Year", "Mileage"};
    private static String border = "--------------------------------------------------------------------";
    private static Scanner s = new Scanner(System.in);
    public static void addAuto(){
        System.out.println();
        System.out.printf("%40s\n","Add  Vehicle ");
        System.out.printf("%21s\n",border);
        inventory.add(new Vehicle());
        System.out.print("Enter Make: ");
        inventory.get(inventory.size()-1).setMake(s.next());
        System.out.print("Enter Model: ");
        inventory.get(inventory.size()-1).setModel(s.next());
        System.out.print("Enter Color: ");
        inventory.get(inventory.size()-1).setColor(s.next());
        System.out.print("Enter Year: ");
        inventory.get(inventory.size()-1).setYear(parse(s.next()));
        System.out.print("Enter Mileage: ");
        inventory.get(inventory.size()-1).setMileage(parse(s.next()));
        System.out.println(inventory.get(inventory.size()-1).getMake()+" "+inventory.get(inventory.size()-1).getModel()+" added to inventory.");
        System.out.println();
    }

    public static void removeAuto(){
        System.out.println();
        System.out.printf("%40s\n","Remove Vehicle");
        System.out.printf("%21s\n",border);
        if(hasInventory()){
            displayInventory();
            System.out.print("Remove vehicle #: ");
            String input = s.next();
            try{
                String temp = (inventory.get(parse(input)-1).getMake()+" "+inventory.get(parse(input)-1).getModel());
                inventory.remove(parse(input)-1);
                System.out.println(temp+" successfully removed");
            }catch(IndexOutOfBoundsException e){
                System.out.println("Invalid Entry");
            }
        }
        else{
            System.out.println("No current inventory");
            System.out.println();
        }
        
    }

    public static boolean hasInventory(){
        if(!inventory.isEmpty()){
            if(inventory !=null){
                return true;
            }
            return false;
        }
        else{
            return false;
        }
    }

    public static void infoBar(){
        System.out.printf("%3s ", "");
        for (String info : carInfo) {
            System.out.printf("%10s ", info);
        }
        System.out.println();
    }

    public static void displayInventory(){
        if(hasInventory()){
            infoBar();
            for(int i=0; i < inventory.size(); i++){
                System.out.printf("%3s:",i+1);
                inventory.get(i).displayInformation();
                System.out.println();
            }
        }
        else{
            System.out.println("No current inventory");
            System.out.println();
        }
    }

    public static int parse(String input){
        try{
            return Integer.parseInt(input);
        }catch (NumberFormatException e){
            return 9999;
        }
    }

    public static void showMenu(){
        System.out.printf("%37s\n","Main Menu");
        System.out.printf("%21s\n",border);
        System.out.println("1:View Inventory");
        System.out.println("2:Add Vehicle to Inventory");
        System.out.println("3:Remove Vehicle from Inventory");
        System.out.println("4:Edit Vehicle Information");
        System.out.println("5:Export Inventory");
        System.out.println("6:Quit");
        System.out.println();
    }

    public static void main(String[] args){
        System.out.println(" Vehicle Inventory Manager ");
        System.out.println("==============================");
        System.out.println();
        while(true){
            showMenu();
            System.out.print("Enter Selection: ");
            switch (parse(s.next())) {
                case 1:
                    System.out.println();
                    System.out.printf("%40s\n","View Inventory");
                    System.out.printf("%21s\n",border);
                    displayInventory();
                    break;
                case 2:
                    addAuto();
                    break;
                case 3:
                    removeAuto();
                    break;
                case 4:
                    System.out.println("Edit Vehicle Information:");
                    //editAuto(inventory);
                    break;
                default:
                    System.out.println("Invalid Entry");
                }
            }
        }
    }






