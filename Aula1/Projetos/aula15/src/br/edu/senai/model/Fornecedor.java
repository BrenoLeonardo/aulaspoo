package br.edu.senai.model;

import java.io.Serializable;

/** Classe para criação de objetos do tipo Fornecedor
 * @author Breno Leonardo
 * @since criada em 16-09-2022
 * @version 1.0
 * 
 * 
 * */
public class Fornecedor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/** 
	 * identificaçao unicada da empresa no cadastro geral de pessoas juridicas do Brasil.
	 */
	private String cnpj;
	/** identifica a razão social da empresa.
	 */
	private String nome;
	/** 
	 * identifica o email para contato da empresa
	 * */
	
	private String email;
	
	/** Constructor cheio de fornecedor
	 * @param cnpj cnpj
	 * @param nome nome
	 * @param email email
	 */
	
	
	public Fornecedor(String cnpj, String nome, String email) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
	}
	
	/** 
	 * Método usado para imprimir dados de um objeto
	 * */
	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", nome=" + nome + ", email=" + email + "]";
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	
	/** Método para calcular o pagamento dos fornecedores onde o retorno deverá ser de 1%
	 * de comissão.
	 * 
	 * @author Breno Leonardo
	 * @since 16-09-2022
	 * @param valor recebem um valor como parâmetro
	 * @return Double retorna um valor acrescido de 1%
	 * @throws IllegalArgumentException Uma exception poderá ser lançada caso um valor negativo seja digitado.
	 * */
	public Double calcularPagamento(Double valor) throws IllegalArgumentException {
		return 0.0;
	}
	
	
}
