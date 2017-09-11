package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuracoNasLetrasTest {

	@Test
	public void testA() {
		int resposta = BuracoNasLetras.numBuracos("A");
		assertEquals(1, resposta); 
	}

}
