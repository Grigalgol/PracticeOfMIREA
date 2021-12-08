package prac15;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //Task1
        System.out.println("==============TASK 1==============");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(12);
        //нет дубликатов, не хранит порядок добавления элементов
        hashSet.add(2002);
        System.out.println("HashSet" + hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        //выводит в отсортированном поряке
        //нет дубликатов
        System.out.println("TreeSet" + treeSet);

        //Task2
        System.out.println("==============TASK 2==============");
        MyMap map = new MyMap();

        System.out.println("Количество Григориев = " + map.getSameFirstNameCount(map.createMap(), "Григорий"));
        System.out.println("Количество Голубевых = " + map.getSameLastNameCount(map.createMap(), "Голубев"));

        //Task3
        System.out.println("==============TASK 3==============");

        HashTable hashTable = new HashTable(10);
        hashTable.put("1", "Григорий");
        hashTable.put("2", "Денис");
        hashTable.put("3", "Илья");
        hashTable.put("4", "Данил");

        System.out.println("Таблица:");
        System.out.println(hashTable+"\n");

        System.out.println("Вывод элемента со значением ключа 3: "+hashTable.get("3"));
        hashTable.remove("2");
        System.out.println("Вывод таблицы после удаления элемента со значением ключа 2: \n"+hashTable);
    }
}
