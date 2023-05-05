package transport;

public interface Animal 
{
    // provides a standard set of methods the child can utilize
    // the child is responsible for how they implement those methods
    void move();
    void eat(int item);
    String speak();
}
