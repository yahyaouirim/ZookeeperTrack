public class Bat extends Mammal {
    public Bat(){
        super(300);
    }
    public void fly(){
        this.energy -= 50;
        System.out.println("The bat is airborne");
    }
    public void eatHumans(){
        this.energy += 25;
        System.out.println("the bat is satisfate");
    }
    public void attackTown(){
        this.energy -= 100;
        System.out.println(" The bat attack the town");
    }
}
