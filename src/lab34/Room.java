package lab34;

public class Room {
    private int x = 1;
    private int y = 1;

    public Room(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Room r) {
            return x == r.x && y == r.y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + getX();
        result = 43 * result + getY();
        return result;
    }
}