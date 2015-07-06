package br.edu.iftm.exercicio;

public class Financiamento {
	private double valorTotalVeiculo;
	private double valorEntrada;
	private int numPrestacoes;
	private double juros;
	private double rendaMensalCliente;
	
	public double getValorTotalVeiculo() {
		return valorTotalVeiculo;
	}
	public void setValorTotalVeiculo(double valorTotalVeiculo) {
		this.valorTotalVeiculo = valorTotalVeiculo;
	}
	public double getValorEntrada() {
		return valorEntrada;
	}
	public void setValorEntrada(double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}
	public int getNumPrestacoes() {
		return numPrestacoes;
	}
	public void setNumPrestacoes(int numPrestacoes) {
		this.numPrestacoes = numPrestacoes;
	}
	public double getJuros() {
		return juros;
	}
	public void setJuros(double juros) {
		this.juros = juros;
	}
	public double getRendaMensalCliente() {
		return rendaMensalCliente;
	}
	public void setRendaMensalCliente(double rendaMensalCliente) {
		this.rendaMensalCliente = rendaMensalCliente;
	}
	
	public double valorASerFinanciado(){
		return getValorTotalVeiculo() - getValorEntrada();
		
	}
	
	public double calcularTaxaDeJuros(){
		return juros / 100;
		
	}
	
	public double calcularPrestacao(){
		double resp = Math.pow(1+calcularTaxaDeJuros(), numPrestacoes);
       
		return (valorASerFinanciado() * calcularTaxaDeJuros()) /
				((1 -(1 / resp)));
		
	}
	
	public double calcularTotalFinanciamento(){
		return calcularPrestacao() * numPrestacoes; 
		
	}
	
	public boolean autorizacaoFinanciamento(){
		double perSalario = rendaMensalCliente * 0.40;
		if(calcularPrestacao() < perSalario){
			return true;
		}else{
		return false;
		}
		
	}
	

}
