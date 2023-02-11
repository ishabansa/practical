class Student1{   //defining a student class
int slno;        //defining field/ data member/ Instance variable
String name;

}

class Student{

public static void main(String...args){    //method of student class

Student1 s = new Student1();         // creating a object
s.slno= 01;
s.name ="isha";

Student1 m = new Student1();         // creating a object
m.slno= 02;
m.name ="ishaa";

System.out.println(s.slno+" "+s.name);
System.out.println(m.slno+" "+m.name);
}
}