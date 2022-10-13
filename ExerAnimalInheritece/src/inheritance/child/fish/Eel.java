package inheritance.child.fish;

import inheritance.child.Fish;

public class Eel extends Fish{
        
    private String releaseEletricCharge;
    
    public Eel(){
        super(10, 7, "Fish", "hot", "Water", "yes");
       // this.releaseEletricCharge = "Yes";        
    }
    
    public Eel(int height, int weight, String animalType, String bloodType,String habitat, String gills) {
        super(height, weight, animalType, bloodType , habitat, gills);
        this.releaseEletricCharge = releaseEletricCharge;
    }

    public String getReleaseEletricCharge() {
        return releaseEletricCharge;
    }

    public void setReleaseEletricCharge(String releaseEletricCharge) {
        this.releaseEletricCharge = releaseEletricCharge;
    }

    @Override
    public String action(){
        return "Eel release! ";
    }
    
   @Override
    public String toString(){
        return "Eel [Habitat= " + getHabitat() + " has gills? = " +getGills()+ " ]"; 
    }


}
