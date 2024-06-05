class Employee
{
   private int emailid;
   public void setEmployeeId(int emailid)
   {
	   this.emailid = emailid;
   }
   
   public int getEmployeeId()
   {
	    System.out.println(emailid);
		return 0;
   }
}
class Company
{
    public static void main(String[] args)
	{
	   Employee e = new Employee();
	   e.setEmployeeId(101);
	   e.getEmployeeId();
	}
}