package br.edu.utfpr.cp.tomeetest.model;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Douglas
 */
@Stateless
public class ProductDao implements Serializable {

    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    public List<Product> listAll() {
        return em.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }

    public void insert(Product p) {
        em.persist(p);
    }
}
