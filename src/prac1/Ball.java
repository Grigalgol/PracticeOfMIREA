package prac1;

public class Ball {
    private String color;
    private int diametr;

    public Ball(String color, int volume) {
        this.color = color;
        this.diametr = volume;
    }

    public Ball() {
        color = "white";
        diametr = 10;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVolume() {
        return diametr;
    }

    public void setVolume(int volume) {
        this.diametr = volume;
    }

    @Override
    public String toString() {
        return color+ " мяч диаметром " + diametr + " см";
    }
}
