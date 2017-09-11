package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuracoNasLetrasTest {

	@Test
	public void testA() {
		int resposta = BuracoNasLetras.numBuracos("A");
		assertEquals(1, resposta); 
	}
	@Test
	public void testB() {
		int resposta = BuracoNasLetras.numBuracos("B");
		assertEquals(2, resposta); 
	}
	@Test
	public void testC() {
		int resposta = BuracoNasLetras.numBuracos("C");
		assertEquals(0, resposta); 
	}
	@Test
	public void testD() {
		int resposta = BuracoNasLetras.numBuracos("D");
		assertEquals(1, resposta); 
	}
	@Test
	public void testE() {
		int resposta = BuracoNasLetras.numBuracos("E");
		assertEquals(0, resposta); 
	}
	@Test
	public void testF() {
		int resposta = BuracoNasLetras.numBuracos("F");
		assertEquals(0, resposta); 
	}
	@Test
	public void testBunda() {
		int resposta = BuracoNasLetras.numBuracos("BUNDA");
		assertEquals(4, resposta); 
	}
}
