public class Gorilla extends Mammal {
    public Gorilla(int energy){
        super(energy);
    }
    public void throwSomething(){
       this.energy -= 5;
        System.out.println(" the gorilla has thrown something");

    }
    public void eatBananas(){
        this.energy += 10;
        System.out.println(" The Gorilla is satisfate");
    }

    public void climb(){
        this.energy -= 10;
        System.out.println(" The gorilla has climbed a tree : ");
    }
    
}
