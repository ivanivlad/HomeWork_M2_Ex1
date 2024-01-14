package zoo;

public class Cage<T extends Animal> {
    private final Animal animal;

    public Cage(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return (T) animal;
    }
}
