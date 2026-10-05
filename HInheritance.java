class Person{
	String name;
	int rno;
	Person(String name,int rno){
	this.name=name;
	this.rno=rno;
	}
	}
class Student extends Person{
	String branch;
	double atd;
	Student(String name,int rno,String branch,double atd){
		super(name,rno);
		this.branch=branch;
		this.atd=atd;
		}
		void sdetails(){
		System.out.println(name+"\n"+rno+"\n"+branch+"\n"+atd);
		}
	}
class Faculty extends Person{
	int salary,age;
	Faculty(String name,int rno,int salary,int age){
		super(name,rno);
		this.salary=salary;
		this.age=age;
		}
	void fdetails(){
	System.out.println(name+"\n"+rno+"\n"+salary+"\n"+age);
	}
		
		}
class HInheritance{
	public static void main(String args[]){
		Student s=new Student("ram",18,"CSE",87.23);
		Faculty f=new Faculty("raju",122,300000,36);
		s.sdetails();
		f.fdetails();
		}
		}
		
		
	
