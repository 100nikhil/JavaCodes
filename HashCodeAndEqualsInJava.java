/*
  https://www.javatpoint.com/equals-and-hashcode-in-java#

  To compare two objects that whether they are the same, it compares the values of both the 
  object's attributes.

  By default, two objects will be the same only if stored in the same memory location.

  equals(obj){}
  It takes the reference object as the parameter, with which we need to make the comparison.

  General Contract of equals() method:---

  -> reflexive: An object x must be equal to itself, which means, for object x, equals(x) 
    should return true.
  
  -> symmetric: for two given objects x and y, x.equals(y) must return true if and only if 
  y.equals(x) returns true.
  
  -> transitive: for any objects x, y, and z, if x.equals(y) returns true and y.equals(z) 
  returns true, then x.equals(z) should return true.
  
  -> consistent: for any objects x and y, the value of x.equals(y) should change, only if 
  the property in equals() changes.
  
  -> For any object x, the equals(null) must return false.

  ----------------------------------------------------------------------------------------

                            HASHCODE

  A hashcode is an integer value associated with every object in Java, facilitating the 
  hashing in hash tables.

  The hashcode() method returns the same hash value when called on two objects, which are equal 
  according to the equals() method. And if the objects are unequal, it usually returns different 
  hash values.

  If two objects are the same as per the equals(Object) method, then if we call the hashCode() 
  method on each of the two objects, it must provide the same integer result.

  "NOTE: As per the Java documentation, both the methods should be overridden to get the 
  complete equality mechanism; using equals() alone is not sufficient. It means, if we 
  override the equals(), we must override the hashcode() method."

*/

//https://www.geeksforgeeks.org/equals-hashcode-methods-java/

public class HashCodeAndEqualsInJava{

  public static void main(String[] args){
    String s1 = "Java";
    String s2 = "Java";

    if(s1.equals(s2)){
      System.out.println("s1 and s2 are equal "+" "+s1.hashCode()+" "+s2.hashCode());
    }

    String s3 = "Java";
    String s4 = "Python";

    if(!s3.equals(s4)){
      System.out.println("s3 and s4 are NOT equal "+" "+s3.hashCode()+" "+s4.hashCode());
    }
    
  }

}