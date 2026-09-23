package br.com.senai.patrimonio.avaliacao.enums;

public enum StatusEvento {
    EVENTO_PLANEJADO("Evento Planejado", 1),
    INSCRICOES_ABERTAS("Inscrições Abertas", 2),
    EVENTO_EM_ANDAMENTO("Evento em Andamento", 3),
    EVENTO_ENCERRADO("Evento Encerrado", 4),
    EVENTO_CANCELADO("Evento Cancelado",5);

    private final String descricao;
    private final int codigo;

    StatusEvento(String descricao, int codigo){
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }
}
