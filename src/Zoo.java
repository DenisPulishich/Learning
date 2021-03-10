
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
    Acacia acacia = new Acacia();
    Cereals cereals = new Cereals();
    Eucalyptus eucalyptus = new Eucalyptus();
    Gazelle gazelle = new Gazelle();
    Roach roach = new Roach();
    Rodents rodents = new Rodents();



    //Работник
        Worker worker = new Worker();
        worker.feed(badger, gazelle);
        worker.feed(badger, eucalyptus);
        worker.getVoice(coala);
        Animal[] animals = new Animal[5];
        animals[0] = badger;
        animals[1] = giraffe;
        animals[2] = duck;
        animals[3] = fish;
        animals[4] = lion;

        for(Animal animal: animals){
            animal.Swim();}

        System.out.println(coala.satiety);
        coala.eat(acacia);
        System.out.println(coala.satiety);
    }
}
