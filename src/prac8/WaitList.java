package prac8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements iWaitList {
    ConcurrentLinkedDeque<E> content;

    public WaitList() {
        content = new ConcurrentLinkedDeque<>();
    }

    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedDeque<>();
        content.addAll(c);
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    @Override
    public void add(Object element) {
        content.add((E) element);
    }

    @Override
    public Object remove() {
        return content.poll();
    }

    @Override
    public boolean contains(Object element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
