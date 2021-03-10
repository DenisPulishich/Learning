package Animal;

import Animal.Run;
import Animal.Swim;
import Animal.Voice;
import allFood.VeggieFood;

public class Coala extends Herbivore implements Run, Voice, Swim {
    @Override
    public void Run() {
        System.out.println("Coala is running");
    }

    @Override
    public String Voice() {
        String s2 = "Urrrr";
        return s2;
    }

    public void eat (VeggieFood food){
        if (food instanceof VeggieFood){
            System.out.println("Coala is eating");
            this.satiety = satiety + food.Meaning;}
        else{
            System.out.println("Eda ne podxodit");
        }
    }

    @Override
    public void Swim() {
        System.out.println("Coala ne plavaet");
    }
}
