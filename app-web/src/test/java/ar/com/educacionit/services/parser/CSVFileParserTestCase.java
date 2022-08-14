package ar.com.educacionit.services.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Collection;

import org.junit.jupiter.api.Test;

import ar.com.educacionit.services.exceptions.ParseException;

public class CSVFileParserTestCase {

	@Test
	public void when_nullfilename_then_throw_exception() {
		assertThrows(IllegalArgumentException.class, () -> {
			//new CSVFileParser(null);
		});
	}

	@Test
	public void when_blankfilename_then_throw_exception() {
		assertThrows(IllegalArgumentException.class, () -> {
			new CSVFileParser("");
		});
	}
	
	@Test
	public void when_doesnot_exists_then_throw_exception() {
		assertThrows(ParseException.class, ()->{
			new CSVFileParser("c:/bla").parse();
		});	
	}
	
	@Test
	public void when_exists_then_notNull() {
		assertNotNull(new CSVFileParser("c:/desarrollo/a"));
		}
	
	@Test
	public void when_exists_then_verify_size() throws ParseException {
		CSVFileParser parser = new CSVFileParser("C:\\desarrollo\\archivo.csv");
		Collection<ArticuloDTO> list = parser.parse();
		assertEquals(2,list.size());
		}
}
