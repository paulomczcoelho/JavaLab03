package inheritance.child.birds;

import inheritance.child.Birds;

public class Eagle extends Birds{
    
    public Eagle() {
        super(2,1,"Wilrd","Hot", "White", "yes" );
    }
        
    public Eagle(int height, int weight, String animalType, String bloodType, String feathers, String fly) {
        super(height, weight, animalType, bloodType, feathers, fly);
    }
    
    @Override
    public String action(){
        return "Eagle Flying!";
    }
    
    @Override
    public String toString(){
        return "Eagle [Height = " +getHeight()+ " weight = " +getWeight()+ " animalType = " +getAnimalType()+ " feathers " +getFeathers() +" can fly? = " +getFly()+" ]"; 
    }


}
