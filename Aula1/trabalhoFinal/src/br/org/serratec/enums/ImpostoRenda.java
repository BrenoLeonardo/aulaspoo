package br.org.serratec.enums;

public enum ImpostoRenda {
	
	
	DESCONTO1("não tem que pagar"){
		public Double calcularIDR(double descontoIR, double salarioBruto, double descontoDependente, double descontoINSS) {
			return descontoIR = (salarioBruto - descontoDependente - descontoINSS);
	},DESCONTO2("não tem que pagar"){
		public Double calcularIDR(double descontoIR, double salarioBruto, double descontoDependente, double descontoINSS) {
			return descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.075) - 142.80;
	},DESCONTO3("não tem que pagar"){
		public Double calcularIDR(double descontoIR, double salarioBruto, double descontoDependente, double descontoINSS) {
			return descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.15) - 354.80;
	},DESCONTO4("não tem que pagar"){
		public Double calcularIDR(double descontoIR, double salarioBruto, double descontoDependente, double descontoINSS) {
			return descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.225) - 636.13;
	},DESCONTO5("não tem que pagar"){
		public Double calcularIDR(double descontoIR, double salarioBruto, double descontoDependente, double descontoINSS) {
			return descontoIR = ((salarioBruto - descontoDependente - descontoINSS)* 0.275) - 869.36;
	};
	
	private Double descontoIR;
	private Double salarioBruto;
	private Double descontoDependente;
	private Double descontoINSS;
	
	
	}
}