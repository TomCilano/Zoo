/**
 * Created by Tom on 9/7/16.
 */
public class Dog extends Mammal {

    public Dog(){
        this.name = "Dog";
    }

    @Override
    public void makeSound(){
        System.out.println("Bark!");
    }
}
