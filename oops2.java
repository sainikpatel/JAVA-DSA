import java.util.*;
// parent class

class Shape {
    public void area() {
        System.out.println("area of rectangle");

    }
}
//child class
class Rectangle extends Shape{
public void area(){
    System.out.println("area of rectangle11111");
}
}
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}


public class oops2 {

public static void main(String args[]){
   Rectangle s1=new Rectangle();
int r=12;
Circle s2=new Circle();
s2.area(r);

}
}