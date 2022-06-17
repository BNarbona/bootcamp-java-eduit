package ar.com.educacionit.services.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ar.com.educacionit.services.exceptions.ParseException;

public class XLSXFileParser extends BaseFile implements IParser<Collection<Producto>> {

	
	public XLSXFileParser (String FilePath) {
		super(FilePath);
	}
	
	@Override
	public Collection<Producto> parse() throws ParseException {
		Collection<Producto> list = new ArrayList<>();
		
		//Workbook
		//Sheet
		//Row
		//cell
		File file = super.getFile();
		
		try( 
			InputStream is = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(is);
			){
			//logica de lectura
			Sheet sheet1= workbook.getSheetAt(0); // pedimos la primer hoja
			
			Iterator<Row> itRows = sheet1.iterator();
			
			//boolean isFirstRow = true;
			Row row = itRows.next();
			
			while(itRows.hasNext()) {
				row = itRows.next();
				/*if(isFirstRow) {		// reemplazamos por avanzar una vez el iterador
					isFirstRow = false;
					continue;
				}*/
				Iterator<Cell> itCells= row.cellIterator();
				while(itCells.hasNext()) {
					Producto p = productoFromCell(itCells);
					list.add(p);	
				}
			}
			return list;
		}catch(IOException fnfe) {
			fnfe.printStackTrace();
			throw new ParseException("No se ha podido convertir el archivo: " + file.getPath());
		}	
	}

	private Producto productoFromCell(Iterator<Cell> itCells) {
		Producto p= new Producto();
		while(itCells.hasNext()) {
			Cell cell = itCells.next();
			switch(cell.getColumnIndex()) {
			case 0: //id
				p.setId((long)cell.getNumericCellValue());//1
				break;
			case 1: //title
				p.setTitle(cell.getStringCellValue());//2
				break;
			case 2: //code
				p.setCode(""+cell.getNumericCellValue());//3
				break;
			case 3: //price
				p.setPrice(cell.getNumericCellValue());//4
				break;
			default:
				break;
			}
			
		}
		return p;
	}

}
