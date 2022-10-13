package inheritance.child;

import inheritance.parent.Animal;

public class Birds extends Animal {
    
    private String feathers;
    private String fly;
    

    public Birds(){//
        super(10, 7, "Birds",  "hot");
        feathers = "Red-feathers";
        fly = "yes";
   }

    public Birds(int height, int weight, String animalType, String bloodType, String feathers, String fly) {
        super(height, weight, animalType, bloodType);
        this.feathers = feathers;
        this.fly = fly;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }
    
    @Override
    public String action(){
        return "Bird flying!";
    }
    
   @Override
    public String toString(){
        return "Birds [ Height " +getHeight()+ " weight " +getWeight()+ " animal type: "  +getAnimalType()+ " feathers " +feathers+ "  can fly? " +getFly()+ "] "; 
    }

    

    
    
}
