import java.time.LocalDate;

public class App{
    public static void main(String[] args){
        Animal dog = new Animal();
        dog.setName ("Rex");
        dog.setAge(3); 
        dog.sethelthLevel(9);
        dog.sethungerLevel(4);
        dog.setmoodLevel(8);
        dog.setfavoriteFood("Beef Kibble");
        dog.setfavoriteActivity("Playing fetch");

        Adopter adopter = new Adopter();
        adopter.setname("Anna");
        adopter.setavailableMoney(500.0);

        Food food = new Food();
        food.setname("Beef Kibble");
        food.setprice(30.0);
        food.setquantity(10);
        food.setexpirationDate(2025,12,31);
        food.setisAvailableInStock(true);

        RecreationalActivity activity = new RecreationalActivity();
        activity.setname("playing fetch");

        Veterinarian vet = new Veterinarian();
        vet.setname("Dr. Smith");
        vet.setspecialization("Small animals");

        Game game = new Game();
        game.setadopter(adopter);
        game.setdog(dog);
        game.setvet(vet);
    }
   
}