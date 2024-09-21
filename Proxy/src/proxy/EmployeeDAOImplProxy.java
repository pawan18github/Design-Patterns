package proxy;

public class EmployeeDAOImplProxy implements EmployeeDAO {

	String access;
	EmployeeDAO employeeDAO;
	
	EmployeeDAOImplProxy(String access){
		this.access=access;
		this.employeeDAO=new EmployeeDAOImpl();
	}
	
	@Override
	public void create() {
		if(access.equals("Admin"))
			this.employeeDAO.create();
		else
			throw new RuntimeException("Resource EmployeeDAO cannot be access by "+access);
	}

}
