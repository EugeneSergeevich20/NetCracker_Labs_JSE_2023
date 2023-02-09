package netcracker.labs.buildings;

import java.util.Arrays;

public class Dwelling {

    private DwellingFloor[] floors;

    public Dwelling(int countFloor, Flat[] flats){
        floors = new DwellingFloor[countFloor];
        for (int i = 0; i < floors.length; i++){
            DwellingFloor floor = new DwellingFloor(flats);
            floors[i] = floor;
        }
    }

    public Dwelling(DwellingFloor[] floors){
        this.floors = floors;
    }

    public int getCountFloors(){
        return floors.length;
    }

    public int getCountFlats(){
        int countFlats = 0;
        for (DwellingFloor floor: floors) {
            countFlats += floor.getCountFlat();
        }
        return countFlats;
    }

    public double getAreaFlats(){
        double areaFlats = 0;
        for (DwellingFloor floor: floors) {
            areaFlats += floor.getAreaFlats();
        }
        return areaFlats;
    }

    public int getRoomFlats(){
        int roomFlats = 0;
        for (DwellingFloor floor: floors) {
            roomFlats += floor.gerRoomFlats();
        }
        return roomFlats;
    }

    public DwellingFloor[] getFloors(){
        return floors;
    }

    public DwellingFloor getFloor(int indexFloor){
        return floors[indexFloor];
    }

    public void updateFloor(int indexFloor, DwellingFloor floor){
        floors[indexFloor] = floor;
    }

    public Flat getFlat(int indexFlat){
        int sum = 0;
        for (int i = 0; i < floors.length; i++){
            DwellingFloor floor = floors[i];
            int countFlat = floor.getCountFlat();
            sum += countFlat;
            if (sum > indexFlat){
                return floor.getFlat(countFlat - (sum - indexFlat));
            }
        }
        return null;
    }

    public void updateFlat(int indexFlat, Flat flat){
        int sum = 0;
        for (DwellingFloor floor : floors) {
            int countFlat = floor.getCountFlat();
            sum += countFlat;
            if (sum > indexFlat) {
                floor.updateFlat(countFlat - (sum - indexFlat), flat);
            }
        }
    }

    public void addFlat(int indexFlat, Flat flat){
        floors[floors.length - 1].addFlat(indexFlat, flat);
    }

    public void deleteFlat(int indexFlat){
        int sum = 0;
        for (DwellingFloor floor : floors) {
            int countFlat = floor.getCountFlat();
            sum += countFlat;
            if (sum > indexFlat) {
                floor.deleteFlat(countFlat - (sum - indexFlat));
            }
        }
    }

    public double getBestSpace(){
        double bestSpace = 0;
        for (DwellingFloor floor: floors) {
            if (floor.getBestSpace() > bestSpace){
                bestSpace = floor.getBestSpace();
            }
        }
        return bestSpace;
    }

    public Flat[] getFlatsArraySorted(){
        Flat[] sortedFlat = new Flat[getCountFlats()];
        int sum = 0;
        for (DwellingFloor floor: floors) {
            System.arraycopy(floor.getFlats(), 0, sortedFlat, sum, floor.getCountFlat());
            sum += floor.getCountFlat();
        }
        for (int i = 0; i < sortedFlat.length; i++){
            for (int j = 0; j < i; j++){
                if (sortedFlat[j].getArea() < sortedFlat[j+1].getArea()){
                    Flat tempFlat = sortedFlat[j];
                    sortedFlat[j] = sortedFlat[j+1];
                    sortedFlat[j+1] = tempFlat;
                }
            }
        }
        return sortedFlat;
    }

    @Override
    public String toString() {
        return "Dwelling{" +
                "floors=" + Arrays.toString(floors) +
                '}';
    }
}
