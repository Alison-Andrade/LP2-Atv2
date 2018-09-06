class Cliente{
	private String nome;
	private String endereco;
	private String telefone;

	public Cliente(String nome, String endereco, String telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome(){
		return this.nome;
	}

	public setNome(String nome){
		this.nome = nome;
	}

	public String getEndereco(){
		return this.endereco;
	}

	public setEndereco(String endereco){
		this.endereco = endereco;
	}

	public String getTelefone(){
		return this.telefone;
	}

	public setTelefone(String telefone){
		this.telefone = telefone;
	}
}