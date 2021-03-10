import Animal.Animal;
import allFood.Food;
import allFood.Meat;
import allFood.VeggieFood;
import Animal.Voice;
import Animal.*;

public class Worker {
    public void feed (Animal animal, Food food){
        if (animal instanceof Carnivorous && food instanceof Meat){
            System.out.println("Плотоядное животное ест");
        }
        else if (animal instanceof Herbivore && food instanceof VeggieFood){
            System.out.println("Травоядное животное ест");
        }
        else {
            System.out.println("Еда не соответствует животному");
        }

    }
    public void getVoice (Voice animal){
        System.out.println(animal.Voice());
    }
}
