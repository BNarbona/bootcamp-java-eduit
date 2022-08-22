package clase16.parser.impl;

import clase16.parser.FileBase;
import clase16.parser.IParse;
import clase16.type.pdfFile;

public class pdfFileParser extends FileBase implements IParse <pdfFile>{

	public pdfFileParser (String file) {
		super(file);
		
	}
	
	@Override
	public pdfFile parse() {
		//hacer logiaca del parseo
		
		return null;
	}

	
	
	
}
