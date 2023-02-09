package netcracker.labs.buildings;

public class Flat {

    private static final double AREA = 50;
    private static final int Room = 2;

    private double area;
    private int room;

    public Flat(){
        this(Room, AREA);
    }

    public Flat(double area){
        this(Room, area);
    }

    public Flat(int room, double area ){
        this.room = room;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area <= 0){
            System.out.println("Площадь не может быть меньше или равняться 0");
        }
        else {
            this.area = area;
        }
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        if (room <= 0){
            System.out.println("Комнат не может быть меньше или равняться 0");
        }
        else {
            this.room = room;
        }
    }

    @Override
    public String toString() {
        return "Flat{" +
                "area=" + area +
                ", room=" + room +
                '}';
    }
}
