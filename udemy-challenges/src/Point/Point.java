package Point;

public class Point
{
    private int x;
    private int y;

    public Point()
    {
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance()
    {
        // current instance
        return Math.sqrt((getX() - 0.0) * (getX() - 0) + (getY() - 0) * (getY() - 0));
    }

    public double distance(int x, int y)
    {
        // current instance from given values
        return Math.sqrt((getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));
    }

    public double distance(Point point)
    {
        // current instance from another point
        return Math.sqrt((getX() - point.getX()) * (getX() - point.getX()) + (getY() - point.getY()) * (getY() - point.getY()));
    }




}
