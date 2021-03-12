package Animal;

import allFood.Meat;

public class Badger extends Carnivorous implements Run, Swim, Voice {
    @Override
    public void Run() {
        System.out.println("Badger is running");
    }

    @Override
    public void Escaping() {
        System.out.println("Run like Usain Bolt");
    }

    @Override
    public void Swim() {
        System.out.println("Badger is swimming");
    }

    @Override
    public void deepSwim() {
        System.out.println("Swimming in the deep");
    }

    @Override
    public String Voice() {
        String s4 = "Whistling";
        return s4;
    }

    @Override
    public void loudVoice() {
        System.out.println("A loud scream");
    }

    public void eat(Meat food) {
        if (food instanceof Meat) {
            System.out.println("Badger is eating");
            this.satiety = satiety + food.Meaning;
        } else {
            System.out.println("Трава не подходит");
        }
    }
}
