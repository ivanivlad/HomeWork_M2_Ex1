import java.util.ArrayList;
import java.util.List;
import magicstorage.Item;
import magicstorage.Storage;
import zoo.Bird;
import zoo.Dog;
import zoo.Tiger;
import zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        //Задание №1 Зоопарк
        ex1();

        //Задание №2
        ex2();

        //Задание №3 Создать волшебный склад.
        ex3();
    }

    private static void ex1() {
        Zoo zoo = new Zoo(new Bird(), new Tiger(), new Dog());
        Bird bird = zoo.getAnimal(Bird.class);
        bird.fly();

        Tiger tiger = zoo.getAnimal(Tiger.class);
        tiger.growl();

        Dog dog = zoo.getAnimal(Dog.class);
        dog.bark();

        Bird bird1 = zoo.getBird();
        bird1.fly();
    }

    private static void ex2() {
        List<Integer> integers1 = List.of(5, 2, 4);
        List<Integer> integers2 = List.of(7, 10);
        List<Integer> integersFinal = new ArrayList<>();
        integersFinal.addAll(integers1);
        integersFinal.addAll(integers2);
        integersFinal.remove(3);
        System.out.printf("Индекс числа 10 - %s \n", integersFinal.indexOf(10));
    }

    private static void ex3() {
        Storage storage = new Storage();
        List<Item> items = List.of(
                new Item("лось"),
                new Item("стол"),
                new Item("стакан"),
                new Item("велосипед"),
                new Item("палка1"),
                new Item("палка2"),
                new Item("палка3"),
                new Item("шины"));
        storage.addToStorage(items);
        List<Item> evenItems = storage.getEvenItems();
        System.out.println(evenItems);
        Item item = storage.getItemByIndex(1);
        System.out.println(item);
        storage.removeAllExceptLast();
    }
}