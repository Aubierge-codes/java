package repository;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {

    private final List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> findAll() {
        return new ArrayList<>(items);
    }

    public T findByIndex(int index) {

        if (index < 0 || index >= items.size()) {
            return null;
        }

        return items.get(index);
    }

    public boolean remove(T item) {
        return items.remove(item);
    }

    public int count() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }
}