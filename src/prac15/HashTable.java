package prac15;

import java.util.Arrays;
import java.util.regex.Pattern;

public class HashTable {

    private HashTableElement[] data;
    private int capacity;
    private int size;

    public static final HashTableElement DEFAULT = new HashTableElement("Defaullt", null);

    public HashTable(int capacity) {
        this.capacity = capacity;
        data = new HashTableElement[capacity]; //массив длины capacity
        for(int i=0; i< data.length; i++) {
            data[i]=DEFAULT;
        }
    }

    public HashTableElement[] getData() {
        return data;
    }

    public void setData(HashTableElement[] data) {
        this.data = data;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    //хеш функция
    public int hashFunc(String key) {
        return key.hashCode()%capacity;
    }

    public Object get (String key) {
        int hash = hashFunc(key);
        while(data[hash].getKey()!=key && data[hash]!=DEFAULT) {
            hash = (hash+1)%capacity; //пока не найдем нужный ключ или не дойдем до значения по умолчанию
        }
        return data[hash].getElement();
    }

    public void put(String key, Object element) {
        if(key!=null) {
            size++;
            int hash = hashFunc(key);
            while(data[hash].getKey()!=key && data[hash]!= DEFAULT) {
                hash=(hash+1)%capacity;
            }
            data[hash] = new HashTableElement(key,element);
        }
    }

    public void remove(String key) {
        if(key!=null){
            int hash = hashFunc(key);
            while(data[hash].getKey()!=key && data[hash]!= DEFAULT) {
                hash=(hash+1)%capacity;
            }
            data[hash] = DEFAULT;
            size--;
        }
    }
    //вывод таблицы

    @Override
    public String toString() {
        String s = "HashTable: ";
        for(int i = 0; i < this.capacity; i++) {
            if(data[i].getElement() != null) {
                s+= data[i].toString();
            }
        }
        return s;
    }
}
