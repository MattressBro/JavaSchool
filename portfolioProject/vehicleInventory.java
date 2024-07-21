package portfolioProject;

//Braden Heeney
//Module 6 milestone portfolio project
//Submit document with methods for your Automobile class, and pseudo code indicating functionality of each method.
import java.util.ArrayList;
public class VehicleInventory{

    private ArrayList<Automobile> inventory = new ArrayList<Automobile>();
    public void addAuto(Automobile newAuto){
        inventory.add(newAuto);
    }
    public void removeAuto(Automobile newAuto){
        inventory.remove(newAuto);
    }
    public void displayInventory(){
        for(int i=0; i < inventory.size(); i++){
            System.out.println(inventory.get(i).getMake()+" "+inventory.get(i).getModel());
            System.out.println("    Color: "+inventory.get(i).getColor());
            System.out.println("    Year: "+inventory.get(i).getYear());
            System.out.println("    Mileage: "+inventory.get(i).getMileage());
            System.out.println();
        }
    }
}