package mypack;
//Java program to initialize the values from one object to another object.  
class CopyConstructor{  
  int id;  
  String name;  
  //constructor to initialize integer and string  
  CopyConstructor(int i,String n){  
  id = i;  
  name = n;  
  }  
  //constructor to initialize another object  
  CopyConstructor(CopyConstructor s){  
  id = s.id;  
  name =s.name;  
  }  
  void display(){System.out.println(id+" "+name);}  
 
  public static void main(String args[]){  
	  CopyConstructor s1 = new CopyConstructor(111,"Karan");  
	  CopyConstructor s2 = new CopyConstructor(s1);  
  s1.display();  
  s2.display();  
 }  
}  

