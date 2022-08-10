class Student{
  int rollNo;
  String name;

  public Student(int r, String n){
    this.rollNo = r;
    this.name = n;
  }

  public boolean equals(Object obj){
    if(this == obj){
      return true;     //if same objects in meory return true
    }
    else if(obj == null || this.getClass() != obj.getClass()){   //if compare with null or some other class return false
      return false;  
    }
    Student s = (Student) obj;   //typecasting
    return 

  }

  public int getRollNo(){
    return this.rollNo;
  }

  public String getName(){
    return this.name;
  }

  public void setRollNo(int r){
    this.rollNo = r;
  }

  public void setName(String n){
    this.name = n;
  }

}

public class Code2{

  public static void main(String[] args){

    Student s1 = new Student(1, "Amit");
    Student s2 = new Student(1, "Aman");

    System.out.println(s1.getName());
    System.out.println(s2.getName());

    System.out.println(s1.equals(s2)); //default Object class implementation of equals will do
                                       // s1==s2

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());

  }
}