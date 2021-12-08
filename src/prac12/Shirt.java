package prac12;

import java.util.StringTokenizer;

public class Shirt {
    private String num;
    private String type;
    private String color;
    private String size;

    public Shirt(String info) {
        StringTokenizer tok = new StringTokenizer(info, ",");
        num = tok.nextToken();
        type = tok.nextToken();
        color = tok.nextToken();
        size = tok.nextToken();
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "num='" + num + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
