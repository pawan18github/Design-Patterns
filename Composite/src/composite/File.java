package composite;

public class File implements FileSystem{
	
	String name;
	File(String name){
		this.name=name;
	}

	@Override
	public void print() {
		System.out.println("Printing "+name);
	}

}
