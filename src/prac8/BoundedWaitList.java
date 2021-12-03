package prac8;

public class BoundedWaitList<E> extends WaitList {
    private int capacity;

    BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(Object element) {
        if (content.size() < capacity)
            super.add(element);
        else System.out.println("BoundedWaitList is full");
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}' + super.toString();
    }
}
