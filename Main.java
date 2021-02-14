private double length;
private double width;

public Rectangle(){
    lenght = 0;
    width = 0;
}

public Rectangle(double newLength, double newWidth){
    double getLength(newLength);
    double getWidth(newWidth);
}

public double getLength(){
    retunt length;
}

public void setLength(newLength){
    this.length = newLength
}

public double getWidth(){
    retunt width;
}

public void setWidth(newWidth){
    this.width = newWidth;
}

public double calculatePerimeter(){
    return 2*length + 2*width;
  }

public double calculateArea(){
    return length*width;
  }

}