import inheritance.child.Birds;
import inheritance.child.Fish;
import inheritance.child.Reptile;
import inheritance.child.birds.Eagle;
import inheritance.child.fish.Eel;
import inheritance.child.reptiles.Crocodile;
import inheritance.parent.Animal;


public class Main {
    
        public static void main(String[] args) {
            
            Animal animal = new Animal();
            System.out.println(animal.action());
            
            Reptile reptile = new Reptile();
            System.out.println(reptile);
            Crocodile crocodile = new Crocodile();
            System.out.println(crocodile);
            
            Birds passaros = new Birds();
            System.out.println(passaros);
            System.out.println(passaros.action());
            
            Eagle aguia = new Eagle();
            System.out.println(aguia);
            System.out.println(aguia.action());


            Fish peixe = new Fish();
            System.out.println(peixe);
            System.out.println(peixe.action());

            Eel eal = new Eel();
            System.out.println(eal);
            
//

        }
    }
        

