package Animal;

import allFood.Meat;

public class Badger extends Carnivorous implements Run, Swim, Voice {
    @Override
    public void Run() {
        System.out.println("Badger is running");
    }

    @Override
    public void Swim() {
        System.out.println("Badger is swimming");
    }

    @Override
    public String Voice() {
        String s4 = "Whistling";
        return s4;
    }
    public void eat (Meat food){
        if (food instanceof Meat){
            System.out.println("Badger is eating");
            this.satiety = satiety + food.Meaning;}
        else{
            System.out.println("Трава не подходит");
        }
    }
}
