package prac3;

public class MovableCircle implements Movable{
    private int raidus;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int raidus) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.raidus = raidus;
    }


    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "raidus=" + raidus +
                center.toString() +
                '}';
    }


}
