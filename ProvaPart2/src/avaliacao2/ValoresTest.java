package avaliacao2;

import static org.junit.Assert.*;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class ValoresTest{
	
	private Valores val;
	
	@Before
	public void ini() {
		val = new Valores();
	}
	
	@Test
	public void inserirValorPositivo() {
		assertTrue(val.ins(5));
	}
	
	@Test
	public void inserirValorNegativo() {		
		assertTrue(val.ins(-5));
	}	
	
	@Test
	public void inserirAcimaDeDez(){
		Random ale = new Random();
		for(int i=0; i<=9; i++) {
			val.ins(ale.nextInt()*100);
		}
		assertFalse(val.ins(ale.nextInt()));
	}
	
	@Test
	public void inserirAteDez(){
		Random ale = new Random();
		for(int i=0; i<=8; i++) {
			val.ins(ale.nextInt()*100);
		}
		assertTrue(val.ins(ale.nextInt()));
	}
	
	@Test
	public void retornarValorRemovido(){
		for(int i=0; i<=9; i++) {
			val.ins(i*2);
			System.out.println(i+"-"+val.valores.get(i));
		}
		assertEquals(6,val.del(3));
	}
	
	@Test
	public void retornarZeroListaVazia(){		
		assertEquals(0,val.del(3));
	}
	
	

}
