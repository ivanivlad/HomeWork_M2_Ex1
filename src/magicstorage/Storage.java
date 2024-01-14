package magicstorage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Storage {
    private final List<Item> items = new ArrayList<Item>();

    public void addToStorage(Collection<Item> addedItems) {
        items.addAll(addedItems);
    }

    public void removeAllExceptLast() {
        var lastItem = items.get(items.size() - 1);
        items.clear();
        items.add(lastItem);
    }

    public Item getItemByIndex(int i) {
        if (i >= items.size()) {
            throw new IndexOutOfBoundsException("Вещи с таким индексом нет");
        }
        var item = items.get(i);
        items.remove(i);
        return item;
    }

    public List<Item> getEvenItems() {
        List<Item> evenItems = new ArrayList<>();
        for (int i = 1; i < items.size(); i = i + 2) {
            evenItems.add(items.get(i));
        }
        return evenItems;
    }
}
