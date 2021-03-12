package Animal;

import allFood.*;

public class Fish extends Carnivorous implements Swim {
    @Override
    public void Swim() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void deepSwim() {
        System.out.println("Swimming in the deep");
    }

    public void eat(Meat food) {
        if (food instanceof Meat) {
            System.out.println("Fish is eating");
            this.satiety = satiety + food.Meaning;
        } else {
            System.out.println("Трава не подходит");
        }
    }
}
