package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TesteBoletos {

	@Test
	public void test() {
		List<Boleto> boletos = new ArrayList<Boleto>();
		Fatura fatura = new Fatura();
		fatura.setValor(1500.0);
		Boleto b1 = new Boleto();
		Boleto b2 = new Boleto();
		Boleto b3 = new Boleto();
		b1.setValor(500.0);
		b2.setValor(400.0);
		b3.setValor(600.0);
		boletos.add(b1);
		boletos.add(b2);
		boletos.add(b3);
		
		util.processadorBoletos(boletos,fatura);
		assertEquals(fatura.getSituacao(), "PAGA");
		
	}

}