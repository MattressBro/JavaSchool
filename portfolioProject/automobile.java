package portfolioProject;

//Braden Heeney
//Module 6 milestone portfolio project
//Submit document with methods for your Automobile class, and pseudo code indicating functionality of each method.

public class Automobile{
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    //default constructor
    public Automobile(){
        make="";
        model="";
        color="";
        year=9999;
        mileage=9999;
    }
    public Automobile(String make, String model, String color, int year, int mileage){
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
        this.make=input;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String input){
        this.model=input;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String input){
        this.color=input;
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


    

}