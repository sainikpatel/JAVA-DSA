//Class  or blueprint or object

class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name+" "+this.age);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

}


public class oops {
// creating objects  or properties
    public static void main(String[] args) {
     Student s1 =new Student("sainik" ,19);// constructor

     s1.printinfo();
    }
}
