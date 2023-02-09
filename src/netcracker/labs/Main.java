package netcracker.labs;

import netcracker.labs.buildings.Dwelling;
import netcracker.labs.buildings.DwellingFloor;
import netcracker.labs.buildings.Flat;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Flat flat1 = new Flat();
        Flat flat2 = new Flat(89.2);
        Flat flat3 = new Flat(3, 98.3);

        DwellingFloor floor1 = new DwellingFloor(3);
        DwellingFloor floor2 = new DwellingFloor(new Flat[]{
                flat1,
                flat2,
                flat3
        });

        Dwelling dwelling1 = new Dwelling(2, new Flat[]{flat2, flat3, flat2, flat1});
        Dwelling dwelling2 = new Dwelling(new DwellingFloor[]{floor2, floor1, floor2});

        System.out.println("Flat:");
        System.out.println(flat1);
        System.out.println(flat2);
        System.out.println(flat3);
        System.out.println("\n");

        System.out.println("Floor:");
        System.out.println(floor1);
        System.out.println(floor2);
        System.out.println("\n");


        System.out.println("Room:");
        System.out.println(floor1.gerRoomFlats());
        System.out.println(floor2.gerRoomFlats());
        System.out.println("\n");

        System.out.println("Area:");
        System.out.println(floor1.getAreaFlats());
        System.out.println(floor2.getAreaFlats());
        System.out.println("\n");

        System.out.println("Count flat:");
        System.out.println(floor1.getCountFlat());
        System.out.println(floor2.getCountFlat());
        System.out.println("\n");

        System.out.println("Flats:");
        System.out.println(Arrays.toString(floor1.getFlats()));
        System.out.println(Arrays.toString(floor2.getFlats()));
        System.out.println("\n");

        System.out.println("Flat by index:");
        System.out.println(floor1.getFlat(2));
        System.out.println(floor2.getFlat(2));
        System.out.println("\n");

        System.out.println("Update flat:");
        floor1.updateFlat(2, flat3);
        System.out.println(floor1.getFlat(2));
        System.out.println("\n");

        System.out.println("Add flat:");
        floor1.addFlat(4, flat3);
        System.out.println(floor1.getFlat(4));
        System.out.println(Arrays.toString(floor1.getFlats()));
        System.out.println("\n");

        System.out.println("Delete flat:");
        floor1.deleteFlat(3);
        System.out.println(floor1.getFlat(3));
        System.out.println(Arrays.toString(floor1.getFlats()));
        System.out.println("\n");

        System.out.println("Best space flat:");
        System.out.println(Arrays.toString(floor2.getFlats()));
        System.out.println(floor2.getBestSpace());
        System.out.println("\n");

        System.out.println("Dwelling:");
        System.out.println(dwelling1);
        System.out.println(dwelling2);
        System.out.println("\n");

        System.out.println("Count flats dwelling:");
        System.out.println(dwelling1.getCountFlats());
        System.out.println(dwelling2.getCountFlats());
        System.out.println("\n");

        System.out.println("Count floor dwelling");
        System.out.println(dwelling1.getCountFloors());
        System.out.println(dwelling2.getCountFloors());
        System.out.println("\n");

        System.out.println("Area flats dwelling");
        System.out.println(dwelling1.getAreaFlats());
        System.out.println(dwelling2.getAreaFlats());
        System.out.println("\n");

        System.out.println("Room flats dwelling");
        System.out.println(dwelling1.getRoomFlats());
        System.out.println(dwelling2.getRoomFlats());
        System.out.println("\n");

        System.out.println("Floor dwelling");
        System.out.println(Arrays.toString(dwelling1.getFloors()));
        System.out.println(Arrays.toString(dwelling2.getFloors()));
        System.out.println("\n");

        System.out.println("Floor by index dwelling");
        System.out.println(dwelling1.getFloor(1));
        System.out.println(dwelling2.getFloor(2));
        System.out.println("\n");

        System.out.println("Update floor dwelling");
        dwelling1.updateFloor(0, floor1);
        System.out.println(dwelling1);
        System.out.println("\n");

        System.out.println("Add floor dwelling");
        System.out.println(dwelling2.getFlat(3));
        System.out.println(dwelling1.getFlat(2));
        System.out.println("\n");

        System.out.println("Update flat dwelling");
        dwelling1.updateFlat(2, flat3);
        System.out.println(dwelling1);
        System.out.println("\n");

        System.out.println("Add flat dwelling");
        dwelling1.addFlat(4, flat2);
        System.out.println(dwelling1);
        System.out.println("\n");

        System.out.println("Delete flat dwelling");
        dwelling1.deleteFlat(5);
        System.out.println(dwelling1);
        System.out.println("\n");

        System.out.println("Best space dwelling");
        System.out.println(dwelling1.getBestSpace());
        System.out.println(dwelling2.getBestSpace());
        System.out.println("\n");

        System.out.println("Dwelling sorted");
        System.out.println(Arrays.toString(dwelling1.getFlatsArraySorted()));
        System.out.println(Arrays.toString(dwelling2.getFlatsArraySorted()));
    }

}
