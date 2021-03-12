package Animal;

import Animal.*;

import Animal.Run;
import Animal.Swim;
import Animal.Voice;
import allFood.VeggieFood;

public class Giraffe extends Herbivore implements Swim, Run, Voice {
    @Override
    public void Run() {
        System.out.println("Giraffe is running");
    }

    @Override
    public void Escaping() {
        System.out.println("Run like Usain Bolt");
    }

    @Override
    public void Swim() {
        System.out.println("Giraffe is swimming");
    }

    @Override
    public void deepSwim() {
        System.out.println("Swimming in the deep");
    }

    @Override
    public String Voice() {
        String s1 = "Muuu";
        return s1;
    }

    @Override
    public void loudVoice() {
        System.out.println("A loud scream");
    }

    public void eat(VeggieFood food) {
        if (food instanceof VeggieFood) {
            System.out.println("Giraffe is eating");
            this.satiety = satiety + food.Meaning;
        } else {
            System.out.println("Мясо не подходит");
        }
    }
}
