package portfolioProject;

//Braden Heeney
//Module 6 milestone portfolio project
//Submit document with methods for your Automobile class, and pseudo code indicating functionality of each method.
import java.util.ArrayList;
public class vehicleInventory{

    private ArrayList<Automobile> inventory = new ArrayList<Automobile>();
    public void addAuto(Automobile newAuto){
        inventory.add(newAuto);
    }
    public void removeAuto(Automobile newAuto){
        inventory.remove(newAuto);
    }
    public void displayInventory(){
        for (Automobile Automobile : inventory) {
            
        }
    }
}