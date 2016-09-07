/**
 * Created by Tom on 9/7/16.
 */
public class Animal {
    String name;

    public void makeSound() {
        System.out.println("Animal sound!");
    }
    @Override
    public String toString() {
        return this.name;
    }
    
}


