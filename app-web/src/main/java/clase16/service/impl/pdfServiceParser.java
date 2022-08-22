package clase16.service.impl;

import clase16.parser.IParse;
import clase16.parser.impl.pdfFileParser;
import clase16.service.FileService;
import clase16.type.pdfFile;

public class pdfServiceParser implements FileService {

	private IParse<pdfFile> parser;
	
	public pdfServiceParser(String file) { 
		
		this.parser = new pdfFileParser (file);
	
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
