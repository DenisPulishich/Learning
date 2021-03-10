package Animal;

import allFood.Food;
import allFood.VeggieFood;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if(food instanceof VeggieFood){
            System.out.println("Herbivore is eating");
        }
        else {
            System.out.println("Мясо не подходит");
        }

        super.eat(food);
    }
}
