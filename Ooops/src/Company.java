
public class Company {
	private int empid;
    public void setEmpid(int eid)
    {
       empid=eid;	
    }
    public int getEmpid()
    {
    	return empid;
    }
}
class Test

{
	public static void main(String[] args) {
	Company e =new Company();
	e.setEmpid(755);
	System.out.println(e.getEmpid());
	}
}

