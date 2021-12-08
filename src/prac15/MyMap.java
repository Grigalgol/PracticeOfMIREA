package prac15;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Голубев", "Григорий");
        map.put("НеГригорий", "Григория");
        map.put("Тимон", "Пумба");
        map.put("Абвгд", "еёжз");
        map.put("Александров", "Александр");
        map.put("Иванов", "Иван");
        return map;
    }

    public int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int count=0;

        //все пары хранятся в интерфейсе Map.Entry, чтобы их получить map.entryset
        for(Map.Entry<String, String> p: map.entrySet()) {
            if(name.equals(p.getValue())) {
                count++;
            }
        }
        return count;
    }

    public int getSameLastNameCount(HashMap<String, String> map, String lastname) {
        int count=0;

        //все пары хранятся в интерфейсе Map.Entry, чтобы их получить map.entryset
        for(Map.Entry<String, String> p: map.entrySet()) {
            if(lastname.equals(p.getKey())) {
                count++;
            }
        }
        return count;
    }
}
