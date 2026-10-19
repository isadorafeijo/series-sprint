package br.edu.ifrs.series.dao;

import java.util.List;

import br.edu.ifrs.series.dominio.Jogo;

public interface JogoDAO {

	List<Jogo> listarTodas();
	Jogo buscarPorId(Long id);
    void salvar(Jogo serie);
    void atualizar(Jogo jogo);
    void remover(Long id);
}