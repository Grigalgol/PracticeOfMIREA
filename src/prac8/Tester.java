package prac8;

public class Tester {
    public static void main(String[] args) {
        WaitList list1 = new WaitList();
        list1.add(14);
        list1.add("text");
        list1.add(11);
        System.out.println(list1.contains("text"));
        System.out.println(list1);
        list1.remove();
        System.out.println(list1);
        System.out.println();

        BoundedWaitList list2 = new BoundedWaitList(3);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);
        System.out.println();

        UnfairWaitList list3 = new UnfairWaitList();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        System.out.println(list3);
        list3.moveToBack(6);
    }
}
