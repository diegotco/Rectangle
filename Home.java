/*
Write a class that create instances of the Rectangle class to finde the total area of two rooms in a house.
*/
public class Home{
public static void main(String[] args){

    /*******************
    RECTANGLE 1
    *******************/

    //Crete an instance for a Main class
    Main room1 = new Main();
    room1.setWidth(25);
    room1.setLength(50);
    double areaOfRoom1 = room1.calculateArea();

    /*******************
    RECTANGLE 2
    *******************/

    Main room2 = new Main(30, 75);
    double areaOfRoom2 = room2.calculateArea();

    //Getting the total area
    double totalArea = areaOfRoom1 + areaOfRoom2;

    System.out.println("Total area of both rooms are: " + totalArea);



}
}