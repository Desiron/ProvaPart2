package avaliacao2;

import java.util.ArrayList;
import java.util.List;

public class Valores implements ValoresITF{
	
	public List<Integer> valores = new ArrayList<>();
		
	@Override
	public boolean ins(int v) {
		if(valores.size()<=9) {
			valores.add(v);
			return true;
		}else {
			return false;			
		}
	}

	@Override
	public int del(int i) {
		if(valores.size()==0) {
			return -1;
		}else {
			int valorRetor = valores.get(i);
			valores.remove(i);
			return valorRetor;
		}
	}

	@Override
	public int size() {		
		return valores.size();
	}

	@Override
	public double mean() {
		if(valores.size()==0) {
			return 0;
		}else {
			double soma=0;
			for(int i=0;i>valores.size();i++) {
				soma = soma + valores.size();
			}
			return (soma/valores.size());
		}
	}

	@Override
	public int greater() {
		if(valores.size()==0) {
			return -1;
		}else {
			return 0;
		}
	}

	@Override
	public int lower() {
		if(valores.size()==0) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
