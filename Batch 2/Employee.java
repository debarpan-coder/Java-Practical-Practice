
public class Employee{
	double HRA,DA,gross,basic_pay;
	String name;
	String id;
	Employee(){
		this.basic_pay=25000.0;	
		this.name="default";
		this.id="default";
	}
	Employee(String id, String name, double basic_pay){
		this.name=name;
		this.id=id;
		this.basic_pay=basic_pay;
	}
	public double[] Calculate(){
		HRA=0.12*this.basic_pay;
		DA=0.03*this.basic_pay;
		gross=this.basic_pay+this.HRA+this.DA;
		double[] obj={HRA,DA,gross}; 
		return obj;
	}
	public void Display(){
		double[] arr=this.Calculate();
		if (this.gross>50000){
			System.out.println(this.id+" "+this.name+" "+this.basic_pay+" "+this.gross);
		}
	}
	public static void main(String[] args){
		Employee emp1=new Employee();
		Employee emp2=new Employee("S444","Debarpan Mondal",52000.00);
		Employee emp3 = new Employee("S420","Hritik Dey",20000.00);
		Employee emp4=new Employee("S412","Suvendu Chowdhury",45000.00);
		emp1.Display();
		emp2.Display();
		emp3.Display();
		emp4.Display();
	}
}