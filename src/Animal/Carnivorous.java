package Animal;

import allFood.Food;
import allFood.Meat;

public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Carnivorous is eating");
        } else {
            System.out.println("Трава не подходит");
        }

        super.eat(food);
    }
}
