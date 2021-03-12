
import allFood.*;
import Animal.*;
import Animal.Coala;


public class Zoo {
    public static void main(String[] args) {
        //Различные животные
        Animal badger = new Badger();
        Coala coala = new Coala();
        Animal duck = new Duck();
        Animal fish = new Fish();
        Giraffe giraffe = new Giraffe();
        Animal lion = new Lion();
        //Различная еда
        Food acacia = new Acacia();
        Food cereals = new Cereals();
        Food eucalyptus = new Eucalyptus();
        Food gazelle = new Gazelle();
        Food roach = new Roach();
        Food rodents = new Rodents();


        //Работник
        Worker worker = new Worker();
        worker.feed(badger, gazelle);
        worker.feed(badger, eucalyptus);
        worker.getVoice(coala);
        Animal[] swimmingAnimals = new Animal[5];
        swimmingAnimals[0] = badger;
        swimmingAnimals[1] = giraffe;
        swimmingAnimals[2] = duck;
        swimmingAnimals[3] = fish;
        swimmingAnimals[4] = lion;

        //Массивы животных и еды
        Animal[] animals = new Animal[6];
        animals[0] = badger;
        animals[1] = giraffe;
        animals[2] = duck;
        animals[3] = fish;
        animals[4] = lion;
        animals[5] = coala;

        Food[] foods = new Food[6];
        foods[0] = acacia;
        foods[1] = cereals;
        foods[2] = eucalyptus;
        foods[3] = gazelle;
        foods[4] = roach;
        foods[5] = rodents;

        for (int j = 0; j < animals.length; j++) {
            worker.feed(animals[j], foods[0]);
            worker.feed(animals[j], foods[1]);
            worker.feed(animals[j], foods[2]);
            worker.feed(animals[j], foods[3]);
            worker.feed(animals[j], foods[4]);
            worker.feed(animals[j], foods[5]);
        }

        for (int j = 0; j < foods.length; j++) {
            worker.feed(animals[0], foods[j]);
            worker.feed(animals[1], foods[j]);
            worker.feed(animals[2], foods[j]);
            worker.feed(animals[3], foods[j]);
            worker.feed(animals[4], foods[j]);
            worker.feed(animals[5], foods[j]);
        }

        for (Animal animal : swimmingAnimals) {
            animal.Swim();
        }

        System.out.println(coala.satiety);
        coala.eat(acacia);
        System.out.println(coala.satiety);
    }
}
