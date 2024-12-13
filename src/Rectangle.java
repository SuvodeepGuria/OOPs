public class Rectangle {
    public static void main(String[] args) {
        RectangleCalculation rectangleCalculation=new RectangleCalculation(2,3,4);
        System.out.println(rectangleCalculation.surfaceArea());
        System.out.println(rectangleCalculation.volume());
    }
}

class RectangleCalculation{
    int height;
    int width;
    int length;
    RectangleCalculation(int height, int width, int length){
        this.height=height;
        this.length=length;
        this.width=width;
    }
    int surfaceArea(){
        return 2*(length*height+length*width+width*height);
    }
    int volume(){
        return length*height*width;
    }
}