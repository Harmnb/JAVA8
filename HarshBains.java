//Ans of Q1
//Encapsulation: It is a mechanism that binds up code and data together.It can be achieved by declaring all the variables in the class as private and then writing public method in the class to get and set the value of the variables.
//for e.g:
 /*Class Harsh
 { 
   private int harid;
   public void setid (int id);
   {
	   harid = id ;
   }
  public int getid()
  {
	  return harid;
  }
 }
 Class Employee{
	 
	 public static void main(String args[])
	 {
		 Harsh obj = new Harsh();
		 obj.setid(132);
		 System.out.println(obj.getid());
	 
	 }
 }*/
//Ans of Q2
//Polymorphism: The word polymorphism is comprised of two words that is "poly" means many forms and "morphs" means forms.Inheritance plays important role in polymorphism.
//we can perform polymorphism by:
//Method overloading: If a class is having more than one method having same name but different arguments,it is known as Method overloading.
//Method overriding: If a derived class has the same method as declared in base class , it is known as method overriding.in this methods can have same name and arguments.
//For e.g: Method overloading
/*class Adder{
	static int add(int a,int b)
	{
		return a+b;
	} 
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
class Employee{
	public static void main(String args[]){
		System.out.println(Adder.add(3,5));
		System.out.println(Adder.add(3,5,2));
	}
}*/

//method overriding

/*class Nop{
	void run(){
		System.out.println("running");
		
	}
} 
class Employee extends Nop{
	public static void main(String args[]){
		Employee obj = new Employee();
		obj.run();
	}
}*/


//Ans of Q3
//1 Access Specifiers: it decides how the data members and methods of a class can be accessed.There are mainly three access specifiers that are:
//PUBLIC: The members declared as public can be accessible from outside the class.
//PROTECTED:The members declared as protective can be accessed from outside the class but only in a derived clas from it.
//PRIVATE:These members are only accessible from within the class.
//2 Packages: A java package is a group of similar types of classes and subpackages.It can be categorized into built in package and user defined packages.
// some common built in packages are java,util etc.
// 3 Final Keyword : "Final" is a keyword that are used with variables,classes and methods which makes them constant throughout the program.
// foe e.g if we make variables as final ,we cannot change its value.
// if we make any class as final then we cannot inherit that class.
//Ans of Q4
/*class Rectangle
{
   static int length = 10;
  int breadth = 20;
 static void area()
{
  System.out.println(" area");
  }
  void circumference ()
  {
  System.out.println("Circumference");
  }
 }
  class Shape extends Rectangle {
     public static void main(String args[]){
	 Rectangle obj = new Rectangle();
	 Rectangle.area();
	 System.out.println(Rectangle.length);
	 
	 obj.circumference();
	 System.out.println(obj.breadth);
	 }
  }*/
  //Ans of Q5
  /*public class Employee{
	  public static void printOne(int n){
		  int i,j;
		  for(i=0;i<n;i++){
			  for(j=2*(n-i);j>=0;j--){
				  System.out.print("");
			  }
			  for(j=0;j<=i;j++){
				  System.out.print("1");
			  }
		  System.out.println();
		  }
	  }
	  public static void main(String ar[]){
		  int n = 4;
	  printOne(n);
	  }
  }*/
  
 
 



  