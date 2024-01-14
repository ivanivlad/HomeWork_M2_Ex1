package zoo;

public class Zoo {
    private final Cage<Bird> birdCage;
    private final Cage<Tiger> tigerCage;
    private final Cage<Dog> dogCage;

    public Zoo(Bird bird, Tiger tiger, Dog dog) {
        this.birdCage = new Cage<>(bird);
        this.tigerCage = new Cage<>(tiger);
        this.dogCage = new Cage<>(dog);
    }

    public Bird getBird() {
        return birdCage.getAnimal();
    }

    public Dog getDog() {
        return dogCage.getAnimal();
    }

    public Tiger getTiger() {
        return tigerCage.getAnimal();
    }

    public <T extends Animal> T getAnimal(Class<T> clazz) {
        if (Bird.class == clazz) {
            return (T) birdCage.getAnimal();
        } else if (Dog.class == clazz) {
            return (T) dogCage.getAnimal();
        } else if (Tiger.class == clazz) {
            return (T) tigerCage.getAnimal();
        }
        throw new RuntimeException("Нет такого типа в этом слове");
    }
}
