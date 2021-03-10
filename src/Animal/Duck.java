package Animal;

import allFood.VeggieFood;

public class Duck extends Herbivore implements Run, Swim, Fly, Voice {
    @Override
    public void Fly() {
        System.out.println("Dick is flying");
    }

    @Override
    public void Run() {
        System.out.println("Duck is running");
    }

    @Override
    public void Swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public String Voice() {
        String s3 = "Krya";
        return s3;
    }
    public void eat (VeggieFood food){
        if (food instanceof VeggieFood){
            System.out.println("Duck is eating");
            this.satiety = satiety + food.Meaning;}
        else{
            System.out.println("Мясо не подходит");
        }
    }
}
