public class Game{
    private Adopter adopter;
    private Animal dog;
    private Veterinarian vet;
    public Adopter getAdopter() {
        return adopter;
    }
    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }
    public Animal getDog() {
        return dog;
    }
    public void setDog(Animal dog) {
        this.dog = dog;
    }
    public Veterinarian getVet() {
        return vet;
    }
    public void setVet(Veterinarian vet) {
        this.vet = vet;
    }
}