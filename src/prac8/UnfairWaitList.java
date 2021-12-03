package prac8;

public class UnfairWaitList<E> extends WaitList {
    public void remove(E element) {
        if (content.contains(element)) {
            int c = 0;
            for (Object el : content) {
                if (el == element) {
                    break;
                } else c++;
            }
            if (c != 0) {
                content.remove(element);
            }
            else {
                System.out.println("Element is first");
            }
        }
        else System.out.println("Element not found");
    }

    public void moveToBack(E element) {
        if(content.contains(element)) {
            content.add(content.remove(element));
        }
        else {
            System.out.println("Element not found");
        }
    }
}
