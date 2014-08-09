package br.com.lifejesus.locadora.domain;

import com.google.common.collect.Sets;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Set;

@Repository
public class UsuarioRepository {

    @PersistenceContext
    private EntityManager em;

    public Set<Usuario> buscaTodos() {
        return Sets.newHashSet(em.createQuery("select u from Usuario u", Usuario.class).getResultList());
    }
}
