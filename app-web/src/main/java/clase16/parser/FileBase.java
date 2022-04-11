package clase16.parser;

public class FileBase {

	protected String file;
	
	public FileBase(String file) {
		if(file!=null) {
			this.file = file;
		} else {
			file = "";
		}
		
		
	}
	
}
