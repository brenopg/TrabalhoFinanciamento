package br.edu.iftm.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.iftm.exercicio.Financiamento;

public class TestesFinanciamento {
	@Test
	public void testValorASerFinanciado(){
		
		Financiamento f = new Financiamento();
		f.setValorTotalVeiculo(40000.00);
		f.setValorEntrada(3000.00);
		double esperado = 37000.00;
		double atual = f.valorASerFinanciado();
		
		assertEquals(esperado, atual, 0.0);
		
	}
	
	@Test
	public void testCalcularTaxaDeJuros(){
		
		Financiamento f = new Financiamento();
		f.setJuros(2);
		double esperado = 0.02;
		double atual = f.calcularTaxaDeJuros();
		
		assertEquals(esperado, atual, 0.00);
		
	}
	
	@Test
	public void testCalcularPrestacao(){
		Financiamento f = new Financiamento();
		f.setJuros(2);
		f.setNumPrestacoes(10);
		f.setValorEntrada(4000.00);
		f.setValorTotalVeiculo(50000.00);
		
		double esperado = 5121.02;
		double atual = f.calcularPrestacao();
		
		assertEquals(esperado, atual, 0.01);
		
	}
	
	@Test
	public void testCalcularTotalFinanciamento(){
		Financiamento f = new Financiamento();
		f.setJuros(2);
		f.setNumPrestacoes(10);
		f.setValorEntrada(4000.00);
		f.setValorTotalVeiculo(50000.00);
		
		double esperado = 51210.20;
		double atual = f.calcularTotalFinanciamento();
		
		assertEquals(esperado, atual, 0.01);
	
	}
	
	@Test
	public void testAutorizacao(){
		Financiamento f = new Financiamento();
		f.setJuros(2);
		f.setNumPrestacoes(10);
		f.setRendaMensalCliente(15000.0);
		f.setValorTotalVeiculo(50000.0);
		f.setValorEntrada(4000.0);
		
		boolean esperado = true;
		boolean atual = f.autorizacaoFinanciamento();
		
		assertEquals(esperado, atual);
		
		f.setRendaMensalCliente(5000.00);
		boolean esperado2 = false;
		boolean atual2 = f.autorizacaoFinanciamento();
		
		assertEquals(esperado2, atual2);
	}
	

}
