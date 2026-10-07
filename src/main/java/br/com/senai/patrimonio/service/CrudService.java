package br.com.senai.patrimonio.service;

import java.util.List;

public interface CrudService<T, ID> {
    T salvar(T entidade);

    T buscarPorId(ID id);

    List<T> listarTodos();

    T atualizar(ID id, T entidade);

    void excluir(ID id);
}
