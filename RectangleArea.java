import java.util.*;
public class RectangleArea {
     public static void main(String[] args) {
        System.out.println("the area will be printed here");
        Scanner input = new Scanner (System.in);
        System.out.println("enter length");
       double l = input.nextDouble();
       System.out.println("enter breadth");
       double b = input.nextDouble();
       
       Area areaObject = new Area(l,b);
       System.out.println("area is "+areaObject.returnArea());
    }
}
class Area{
    double l;
    double b;
  Area(double length,double breadth){
       l = length;
      b = breadth; 
  }
   public double returnArea(){
       double area = l * b ;
       return area;
   }
}