package portfolioProject;

//Braden Heeney
//Module 6 milestone portfolio project
//Submit document with methods for your Vehicle class, and pseudo code indicating functionality of each method.

public class Vehicle{
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    //default constructor
    public Vehicle(){
        make="Make";
        model="Model";
        color="";
        year=0;
        mileage=0;
    }
    public Vehicle(String make, String model, String color, int year, int mileage){
        this.make=make;
        this.model=model;
        this.color=color;
        this.year=year;
        this.mileage=mileage;
    }
    public String getMake(){
        return make;
    }
    public void setMake(String input){
        this.make=input.toUpperCase();
        
    }
    public String getModel(){
        return model;
    }
    public void setModel(String input){
        this.model=input.toUpperCase();
    }
    public String getColor(){
        return color;
    }
    public void setColor(String input){
        this.color=input.toUpperCase();
    }
    public int getYear(){
        return year;
    }
    public void setYear(int input){
        this.year=input;
    }
    public int getMileage(){
        return mileage;
    }
    public void setMileage(int input){
        this.mileage=input;
    }
    public void displayInformation(){
        System.out.printf("%10s %10s %10s %10s %10s\n",this.getMake(),this.getModel(), this.getColor(), this.getYear(), this.getMileage());
        //System.out.println("   Model: "+this.getModel());
        //System.out.println("   Color: "+this.getColor());
        //System.out.println("    Year: "+this.getYear());
        //System.out.println(" Mileage: "+this.getMileage());
        //System.out.println();
    }
}
