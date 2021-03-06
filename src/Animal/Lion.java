package Animal;

import allFood.Meat;

public class Lion extends Carnivorous implements Run, Swim, Voice {
    @Override
    public void Run() {
        System.out.println("Lion is running");
    }

    @Override
    public void Escaping() {
        System.out.println("Run like Usain Bolt");
    }

    @Override
    public void Swim() {
        System.out.println("Lion is swimming");
    }

    @Override
    public void deepSwim() {
        System.out.println("Swimming in the deep");
    }

    @Override
    public String Voice() {
        String s5 = "Arrrr";
        return s5;
    }

    @Override
    public void loudVoice() {
        System.out.println("A loud scream");
    }

    public void eat(Meat food) {
        if (food instanceof Meat) {
            System.out.println("Lion is eating");
            this.satiety = satiety + food.Meaning;
        } else {
            System.out.println("Трава не подходит");
        }
    }
}
