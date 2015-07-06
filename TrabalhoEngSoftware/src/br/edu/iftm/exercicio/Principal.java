package br.edu.iftm.exercicio;

public class Principal {

	public static void main(String[] args) {
		Financiamento f = new Financiamento();
		f.setJuros(2);
		f.setNumPrestacoes(10);
		f.setRendaMensalCliente(15000.0);
		f.setValorTotalVeiculo(50000.0);
		f.setValorEntrada(4000.0);
		
		System.out.println("Valor a ser Financiado: " + f.valorASerFinanciado());
		System.out.println("Valor das prestações: " + f.calcularPrestacao());
		System.out.println("Total a ser pago (Soma das Prestações):" + f.calcularTotalFinanciamento());
		
		if(f.autorizacaoFinanciamento() == true){
			System.out.println("Você está autorizado a financiar o veículo.");
		}else{
			System.out.println("Você não está autorizado a financiar o veículo.");
		}
	}

}
