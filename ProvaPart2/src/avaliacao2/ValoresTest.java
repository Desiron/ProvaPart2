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
		}
		assertEquals(6,val.del(3));
	}
	
	@Test
	public void retornarMenosUmListaVazia(){
		assertEquals(-1,val.del(3));
	}
	
	@Test
	public void retornarZeroListaVaziaMetodoSize() {
		assertEquals(0, val.size());
	}
	
	@Test
	public void retornarQuantidadeDeNumNaLista(){
		for(int i=0; i<=6; i++) {
			val.ins(i*2);			
		}
		assertEquals(7,val.size());
	}

	@Test
	public void retornarZeroListaVaziaMetodoMean(){
		assertEquals(0,val.mean(),0.0);
	}
	
	@Test
	public void retornarMediaUmValorInserido(){
		for(int i=0; i<1; i++) {
			val.ins(5);
		}
		assertEquals(5,val.mean(),0.0);
	}
	
	@Test
	public void retornarMediaMaisDeUmValorInseridoVezes5(){
		for(int i=0; i<8; i++) {
			val.ins(i*5);			
		}
		assertEquals(17.5,val.mean(),0.0);
	}
	
	@Test
	public void retornarMediaMaisDeUmValorInseridoVezes2(){
		for(int i=0; i<8; i++) {
			val.ins(i*2);			
		}
		assertEquals(7,val.mean(),0.0);
	}
	
	@Test
	public void retornarMenosUmMetodoGreater(){	
		assertEquals(-1,val.greater());
	}
	
	@Test
	public void retornarMaiorValorNoInicioDaLista(){
		val.ins(20);
		for(int i=0;i<3; i++) {
			val.ins(i*2);
		}
		assertEquals(20,val.greater());
	}
	
	@Test
	public void retornarMaiorValorNoFimDaLista(){
		for(int i=0;i<3; i++) {
			val.ins(i*2);
		}
		val.ins(40);
		assertEquals(40,val.greater());
	}
	
	@Test
	public void retornarMaiorValorNoMeioDaLista(){
		
		for(int i=1;i<4; i++) {
			val.ins(i*2);
		}
		val.ins(50);
		for(int i=1;i<4; i++) {
			val.ins(i*2);
		};
		assertEquals(50,val.greater());
	}
	
	@Test
	public void retornarMaiorValorUmNumLista(){
		val.ins(1);
		assertEquals(1,val.greater());
	}
	
	@Test
	public void retornarMenosUmMetodoLower(){	
		assertEquals(-1,val.lower());
	}
	
	@Test
	public void retornarMenorValorNoInicioDaLista(){
		val.ins(1);
		for(int i=1;i<4; i++) {
			val.ins(i*2);
		}
		assertEquals(1,val.lower());
	}
	
	@Test
	public void retornarMenorValorNoFimDaLista(){
		for(int i=1;i<4; i++) {
			val.ins(i*2);
		}
		val.ins(1);
		assertEquals(1,val.lower());
	}
	
	@Test
	public void retornarMenorValorNoMeioDaLista(){		
		for(int i=1;i<4; i++) {
			val.ins(i*2);
		}
		val.ins(1);
		for(int i=1;i<4; i++) {
			val.ins(i*2);
		};
		assertEquals(1,val.lower());
	}
	
	@Test
	public void retornarMenorValorUmNumLista(){
		val.ins(20);
		assertEquals(20,val.lower());
	}
}
