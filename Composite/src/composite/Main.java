package composite;

public class Main {
	public static void main(String[] args) {
		Directory parentDir=new Directory();
		
		FileSystem file1=new File("file1");
		Directory childDirectory=new Directory();
		FileSystem file2=new File("file2");
		
		parentDir.add(file1);
		parentDir.add(childDirectory);
		
		childDirectory.add(file2);
		parentDir.print();
		
	}
}
