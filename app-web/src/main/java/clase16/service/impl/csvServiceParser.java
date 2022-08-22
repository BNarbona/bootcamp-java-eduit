package clase16.service.impl;

import clase16.parser.IParse;
import clase16.parser.impl.csvFileParser;
import clase16.service.FileService;
import clase16.type.csvFile;

public class csvServiceParser implements FileService {

	private IParse<csvFile> parser;
	
	public csvServiceParser(String file) { 
		
		this.parser = new csvFileParser (file);
	
	}
	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	
}
