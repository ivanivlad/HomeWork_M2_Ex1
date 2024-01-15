package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> animals = new ArrayList<Animal>();

    public <T extends Animal> void putAnimal(T animal) {
        animals.add(animal);
    }

    public <T extends Animal> T getAnimal(Class<T> clazz) {
        for (var animal: animals) {
            if ( clazz.isInstance(animal)) {
                return (T) animal;
            }
        }
        throw new RuntimeException("Нет такого животного");
    }

}
