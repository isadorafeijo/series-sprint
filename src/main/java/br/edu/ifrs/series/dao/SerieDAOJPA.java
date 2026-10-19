package br.edu.ifrs.series.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import br.edu.ifrs.series.dominio.Serie;

@Repository
@Transactional
public class SerieDAOJPA implements SerieDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Serie> listarTodas() {
        return em
            .createQuery("SELECT s FROM Serie s", Serie.class)
            .getResultList();
    }

    @Override
    public Serie buscarPorId(Long id) {
        return em.find(Serie.class, id);
    }

    @Override
    public void salvar(Serie serie) {
        em.persist(serie);
    }

    @Override
    public void atualizar(Serie serie) {
        em.merge(serie);
    }

    @Override
    public void remover(Long id) {
        Serie serie = em.find(Serie.class, id);
        if (serie != null) {
            em.remove(serie);
        }
    }
}
