package proxy;

public class Main {
	public static void main(String[] args) {
		EmployeeDAO proxy1=new EmployeeDAOImplProxy("Admin");
		EmployeeDAO proxy2=new EmployeeDAOImplProxy("Other");
		try {
			proxy1.create();
			proxy2.create();
		}catch (Exception e) {
			System.out.print(e.getLocalizedMessage());
		}
	}
}
