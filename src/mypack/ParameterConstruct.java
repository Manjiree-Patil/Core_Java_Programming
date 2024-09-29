package mypack;
//Java Program to demonstrate the use of the parameterized constructor.  
class ParameterConstruct{  
  int id;  
  String name;  
  //creating a parameterized constructor  
  ParameterConstruct(int i,String n){  
  id = i;  
  name = n;  
  }  
  //method to display the values  
  void display(){System.out.println(id+" "+name);}  
 
  public static void main(String args[]){  
  //creating objects and passing values  
	  ParameterConstruct s1 = new ParameterConstruct(111,"Karan");  
	  ParameterConstruct s2 = new ParameterConstruct(222,"Aryan");  
  //calling method to display the values of object  
  s1.display();  
  s2.display();  
 }  
}  


