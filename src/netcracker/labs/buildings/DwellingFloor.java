package netcracker.labs.buildings;

import java.util.Arrays;

public class DwellingFloor {

    private Flat[] flats;

    public DwellingFloor(int countFlat) {
        this.flats = new Flat[countFlat];
        for (int i = 0; i < countFlat; i++) {
            Flat flat = new Flat();
            flats[i] = flat;
        }
    }

    public DwellingFloor(Flat[] flats) {
        this.flats = flats;
    }

    public int getCountFlat() {
        return this.flats.length;
    }

    public double getAreaFlats() {
        double areaFlats = 0;
        for (Flat flat : flats) {
            areaFlats += flat.getArea();
        }
        return areaFlats;
    }

    public int gerRoomFlats() {
        int roomFlats = 0;
        for (Flat flat : flats) {
            roomFlats += flat.getRoom();
        }
        return roomFlats;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public Flat getFlat(int flatIndex) {
        if (flatIndex < 0 || flatIndex > flats.length - 1) {
            System.out.println("Такой квартиры не существует");
        } else {
            return flats[flatIndex];
        }
        return null;
    }

    public void updateFlat(int flatIndex, Flat flat){
        if (flatIndex < 0 || flatIndex > flats.length - 1) {
            System.out.println("Такой квартиры не существует");
        } else {
            flats[flatIndex] = flat;
        }
    }

    public void addFlat(int flatIndex, Flat flat){
        Flat[] tempFlats = new Flat[flatIndex + 1];
        for (int i = 0; i < flats.length; i++) {
            tempFlats[i] = flats[i];
        }
        for (int i = 0; i < tempFlats.length; i++) {
            if (tempFlats[i] == null) {
                tempFlats[i] = new Flat();
            }
        }
        tempFlats[flatIndex] = flat;
        flats = tempFlats;
    }

    public void deleteFlat(int flatIndex){
        Flat[] tempFlats = new Flat[flats.length - 1];
        for (int i = 0, j = 0; i < flats.length; i++){
            if (i != flatIndex){
                tempFlats[j++] = flats[i];
            }
        }
        flats = tempFlats;
    }

    public double getBestSpace(){
        double bestSpace = 0;
        for (Flat flat : flats) {
            double tempSpace = flat.getArea();
            if (tempSpace > bestSpace) {
                bestSpace = tempSpace;
            }
        }
        return bestSpace;
    }

    @Override
    public String toString() {
        return "DwellingFloor{" +
                "flats=" + Arrays.toString(flats) +
                '}';
    }
}
