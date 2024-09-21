package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

	List<FileSystem> fileSystems=new ArrayList<FileSystem>();
	
	void add(FileSystem fileSystem) {
		this.fileSystems.add(fileSystem);
	}
	
	@Override
	public void print() {
		for(FileSystem fileSystem :fileSystems) {
			fileSystem.print();
		}
	}

}
