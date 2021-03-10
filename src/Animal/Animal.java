package Animal;
import allFood.*;
public abstract class Animal implements Swim {
    public int satiety = 0;

    public void eat(Food food) {
        this.satiety = satiety + food.Meaning;
    }
}








