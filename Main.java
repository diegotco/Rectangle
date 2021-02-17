public class Main{

    private double length;
    private double width;

    public Main(){
        length = 0;
        width = 0;
    }

    public Main(double newLength, double newWidth){
        setLength(newLength);
        setWidth(newWidth);
    }

    public double getLength(){ //Getter
        return length;
    }

    public void setLength(double newLength){ //Setter
        this.length = newLength;
    }

    public double getWidth(){ //Getter
        return width;
    }

    public void setWidth(double newWidth){ //Setter
        this.width = newWidth;
    }

    public double calculatePerimeter(){
        return (2*length) + (2*width);
    }

    public double calculateArea(){
        return length*width;
    }

}
