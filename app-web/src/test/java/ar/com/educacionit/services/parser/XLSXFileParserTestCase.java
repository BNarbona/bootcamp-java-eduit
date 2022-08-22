package ar.com.educacionit.services.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Collection;

import org.junit.jupiter.api.Test;

import ar.com.educacionit.services.exceptions.ParseException;

public class XLSXFileParserTestCase {

	@Test
	public void when_nullfilename_then_throw_exception() {
		assertThrows(IllegalArgumentException.class, () -> {
			new XLSXFileParser(null);
		});
	}

	@Test
	public void when_blankfilename_then_throw_exception() {
		assertThrows(IllegalArgumentException.class, () -> {
			new XLSXFileParser("");
		});
	}
	
	@Test
	public void when_doesnot_exists_then_throw_exception() {
		assertThrows(ParseException.class, ()->{
			new XLSXFileParser("c:/bla").parse();
		});	
	}
	
	@Test
	public void when_exists_then_notNull() {
		assertNotNull(new XLSXFileParser("c:/desarrollo/a"));
		}
	
	@Test
	public void when_xlsx_exists_then_verify_size() throws ParseException {
		XLSXFileParser parser = new XLSXFileParser("C:\\desarrollo\\educationit\\archivo.xlsx");
		Collection<ArticuloDTO> list = parser.parse();
		assertEquals(2,list.size());
		}
}
