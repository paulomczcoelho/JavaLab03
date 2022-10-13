package inheritance.parent;

public class Animal{
    
    private int height;
    private int weight;
    private String animalType;
    private String bloodType; 

    public Animal(){
        this.height = 90;
        this.weight = 213;
        this.animalType = "Reptile";
        this.bloodType = "Cold";
    }

    public Animal(int height, int weight, String animalType, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }
//
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String action(){
        return "Animal sound!";
    }







}