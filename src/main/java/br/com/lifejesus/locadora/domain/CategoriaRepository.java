package br.com.lifejesus.locadora.domain;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Fernando_2 on 09/07/2014.
 */
@Component
public class CategoriaRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Categoria> buscaTodasCategorias(){
        return Lists.newArrayList(em.createQuery("select c from Categoria c").getResultList());
    }

    public void adicionaNovaCategoria(Categoria categoria){
        em.persist(categoria);
    }
    public void alteraCategegoriaCadastrada(Categoria categoria){
        em.merge(categoria);
    }

    public void removeCategoriaCadastrada(Categoria categoria){
        em.remove(categoria);
    }
}
