package prac8;

import java.util.Collection;

public interface iWaitList<E> {
    public void add(E element);
    public E remove();
    public boolean contains(E element);
    public boolean containsAll(Collection<E> c);
    public boolean isEmpty();
}
