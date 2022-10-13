package inheritance.child;

import inheritance.parent.Animal;

public class Reptile extends Animal {
    private String skynType;
    private String bone;
    private String eggType;

    public Reptile(){
        skynType = "REPTILE-Leather";
        bone = "REPTILE-backbone";
        eggType = "REPTILE-Soft-shelled eggs";
    }
    
    public Reptile(String skynType, String bone, String eggType) {
        this.skynType = skynType;
        this.bone = bone;
        this.eggType = eggType;
    }

    public String getSkynType() {
        return skynType;
    }

    public void setSkynType(String skynType) {
        this.skynType = skynType;
    }

    public String getBone() {
        return bone;
    }

    public void setBone(String bone) {
        this.bone = bone;
    }

    public String getEggType() {
        return eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    @Override
    public String action(){
        return "crawling!";
    }
    @Override
    public String toString(){
        return "Reptile [Skin type= " +skynType + " bone = " +bone+  " egg types = " + eggType + " ]"; 
    }

}


