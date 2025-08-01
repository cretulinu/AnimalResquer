import java.time.LocalDate;

public class App{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName ("Rex");
        dog.setAge(3); 
        dog.setHealthLevel(9);
        dog.setHungerLevel(4);
        dog.setMoodLevel(8);
        dog.setFavoriteFood("Beef Kibble");
        dog.setFavoriteActivity("Playing fetch");

        dog.eat();
        dog.bark();
        dog.sleep();

        Adopter adopter = new Adopter();
        adopter.setName("Anna");
        adopter.setAvailableMoney(500.0);

        AnimalFood food = new AnimalFood();
        food.setName("Beef Kibble");
        food.setPrice(30.0);
        food.setQuantity(10);
        food.setExpirationDate(LocalDate.of(2025,12,31));
        food.setIsAvailableInStock(true);

        RecreationalActivity activity = new RecreationalActivity();
        activity.setName("playing fetch");

        Veterinarian vet = new Veterinarian();
        vet.setName("Dr. Smith");
        vet.setSpecialization("Small animals");

        Game game = new Game();
        game.setAdopter(adopter);
        game.setDog(dog);
        game.setVet(vet);
    }
   
}