public enum StatusButton {
	INICIO(1,""),
	FATORIAL(1,"!"),
	POTENCIA(2,"^"),
	SOMA(2,"+"),
	PRODUTO(2,"*"),
	MDC(2,"MDC"),
	PG(3,"PG");
	private int nValores;
	private String descricao;
	
	
	
	public String getValor() {
		return this.name();
	}
	private StatusButton(int nValores, String descricao) {
		this.nValores = nValores;
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public int getnValores() {
		return nValores;
	}
}
