package clase16.parser.impl;

import clase16.parser.FileBase;
import clase16.parser.IParse;
import clase16.type.csvFile;

public class csvFileParser extends FileBase implements IParse <csvFile>{

	public csvFileParser (String file) {
		super(file);
		
	}
	
	@Override
	public csvFile parse() {
		//hacer logiaca del parseo
		
		return null;
	}

	
	
	
}
