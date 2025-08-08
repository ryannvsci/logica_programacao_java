package exercicioslogica.ex11;

public enum FormaPagamento {
    AVISTA_PIX_DESCONTO_15(1, "À vista no pix"),
    AVISTA_CREDITO_DESCONTO_10(2, "À vista no crédito"),
    PARCELADO_SEM_JUROS(3, "Parcelado em até duas vezes"),
    PARCELADO_COM_JUROS(4, "Parcelado em mais três vezes ou mais");

    public int numero;
    public String descricao;

    FormaPagamento(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    public static FormaPagamento tipoPagamentoPorNumero (int tipoPagamento) {
        for (FormaPagamento formaPagamento : values()) {
            if (formaPagamento.getNumero() == tipoPagamento) {
                return formaPagamento;
            }
        } return null;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }
}