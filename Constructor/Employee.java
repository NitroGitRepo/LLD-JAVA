class Employee{

    String name;
	int emp_id;
	Employee(String name, int id){ this.name = name; this.emp_id = id; }
	
	public void Employee(){System.out.println("call");}
	
	public static void main(String[] args){
	    Employee e1 = new Employee("Rajneesh Yadav", 1);
		Employee e2 = new Employee("Rohan Jain", 2);
		System.out.println("Employee E1 = "+ e1.name + " " + e1.emp_id);
		System.out.println("Employee E1 = "+ e2.name + " " + e2.emp_id);
		e1.Employee();
		
	}
}