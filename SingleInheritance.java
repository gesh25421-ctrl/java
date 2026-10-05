class Bank{
	String name;
	int balance,age;
	Bank(String name,int balance,int age){
		this.name=name;
		this.balance=balance;
		this.age=age;
	}
	void details(){
		System.out.println(name+"\n"+balance+"\n"+age);
	}
	}
class Account extends Bank{
	int tax;
	Account(String name,int balance,int age,int tax){
		super(name,balance,age);
		this.tax=tax;
		}
	void displayBal(){
		System.out.println(balance-tax);
		balance=balance-tax;
		}
		}
	
class SingleInheritance{
	public static void main(String args[]){
	Account o=new Account("ram",20000,19,25);
	o.details();
	o.displayBal();
	o.details();
	}
	}

