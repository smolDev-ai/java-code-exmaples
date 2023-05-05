package transport;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    private static List<AbstractVehicle> filterVehicle(List<AbstractVehicle> vehicles, CheckVehicle tester)
    {
        List<AbstractVehicle> tempList = new ArrayList<>();

        for(AbstractVehicle elem : vehicles)
        {
            if(tester.test(elem))
            {
                tempList.add(elem);
            }
        }

        return tempList;
    }

    public static void main(String[] args) 
    {
        System.out.println("Welcome to Java Day 2!!");

        System.out.println("\n*** Interfaces ***");
        Horse joe = new Horse("joe");
        joe.eat(10);
        for(int i = 0; i < 3; i++)
        {
            joe.move();
        }

        System.out.println("Joe: " + joe.getFuelLevel());

        HorseFromAbstractVehicle secretariat = new HorseFromAbstractVehicle("Secretariat", 10);
        secretariat.addFuel(10);

        // after adding fuel
        System.out.println("Secretariat's fuel is: " + secretariat.getFuelLevel());

        HorseFromAbstractVehicle eclipse = new HorseFromAbstractVehicle("Eclipse");

        eclipse.move(10);

        HorseFromAbstractVehicle trigger = new HorseFromAbstractVehicle("Trigger", 10);
        HorseFromAbstractVehicle seattleSlew = new HorseFromAbstractVehicle("Seattle Slew", 10);
        HorseFromAbstractVehicle americanPharoah = new HorseFromAbstractVehicle("American Pharoah", 10);

        Auto vw = new Auto(1, "Eurovan", 2000);
        Auto toyota = new Auto(10, "Tundra", 1998);
        Auto honda = new Auto(5, "Accord", 2003);

        vw.move();
        vw.move();

        System.out.println("Eurovan fuel level: " + vw.getFuelLevel());

        // the type in List's generic can be an abstract class or interface
        List<AbstractVehicle> vehicles = new ArrayList<>();
        vehicles.add(secretariat);
        vehicles.add(eclipse);
        vehicles.add(trigger);
        vehicles.add(seattleSlew);
        vehicles.add(americanPharoah);
        vehicles.add(vw);
        vehicles.add(toyota);
        vehicles.add(honda);

        System.out.println(vehicles);

        System.out.println();
        System.out.println("\n*** Sort List ***");

        // Lambda Expression -- Sorts alphabetically
        vehicles.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        vehicles.forEach(el -> System.out.println(el.getName()));

        System.out.println("\n\n *** List Negative Fuel Levels ***");
        List<AbstractVehicle> filteredList = filterVehicle(vehicles, (v) -> v.getFuelLevel() < 0);
        filteredList.sort((v1, v2) -> v2.getFuelLevel() - v1.getFuelLevel());
        filteredList.forEach(v -> System.out.println(v));

        System.out.println("\n*** Horse with positive fuel level ***");
        filteredList = filterVehicle(vehicles, (v) -> v.getFuelLevel() > 0 && v instanceof HorseFromAbstractVehicle);
        filteredList.sort((v1, v2) -> v2.getFuelLevel() - v1.getFuelLevel());
        filteredList.forEach(v -> System.out.println(v));
    }
}