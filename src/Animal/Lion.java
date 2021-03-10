package Animal;

import allFood.Meat;

public class Lion extends Carnivorous implements Run, Swim, Voice {
    @Override
    public void Run() {
        System.out.println("Lion is running");
    }

    @Override
    public void Swim() {
        System.out.println("Lion is swimming");
    }

    @Override
    public String Voice() {
        String s5 = "Arrrr";
        return s5;
    }
    public void eat (Meat food){
        if (food instanceof Meat){
            System.out.println("Lion is eating");
            this.satiety = satiety + food.Meaning;}
        else{
            System.out.println("Трава не подходит");
        }
    }
}
