package clase16.service.impl;

import clase16.parser.IParse;
import clase16.parser.impl.xlsxFileParser;
import clase16.service.FileService;
import clase16.type.xlsxFile;

public class xlsxServiceParser implements FileService {

private IParse<xlsxFile> parser;
	
	public xlsxServiceParser(String file) { 
		
		this.parser = new xlsxFileParser (file);
	
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
