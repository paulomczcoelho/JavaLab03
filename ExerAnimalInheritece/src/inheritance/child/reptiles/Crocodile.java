package inheritance.child.reptiles;

import inheritance.child.Reptile;

public class Crocodile extends Reptile{
    private String eggType;
    
    public Crocodile(){
        super("CROCLeather","CROCBackbone", "CROCHard-shelled eggs");   
        this.eggType = "CROCHard-shelled eggs";        
    }
    
    public Crocodile(String skynType, String bone, String eggType) {
        super(skynType, bone, eggType);
        this.eggType = eggType;
    }

    @Override
    public String action(){
        return "Crocodile eating!";
    }
    
   @Override
    public String toString(){
        return "Crocodile [Skin type= " + getSkynType() + " bone = " +getBone()+  " egg types = " + eggType + " ]"; 
    }


}
