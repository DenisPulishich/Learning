import Animal.Animal;
import allFood.Food;
import allFood.Meat;
import allFood.VeggieFood;
import Animal.Voice;
import Animal.*;

public class Worker {
    public void feed(Animal animal, Food food) {
        if (animal instanceof Carnivorous && food instanceof Meat) {
            animal.eat(food);
        } else if (animal instanceof Herbivore && food instanceof VeggieFood) {
            animal.eat(food);
        } else {
            System.out.println("Еда не соответствует животному");
        }

    }

    public void getVoice(Voice animal) {
        System.out.println(animal.Voice());
    }
}
