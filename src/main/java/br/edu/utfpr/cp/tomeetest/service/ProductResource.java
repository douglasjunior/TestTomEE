package br.edu.utfpr.cp.tomeetest.service;

import br.edu.utfpr.cp.tomeetest.model.Product;
import br.edu.utfpr.cp.tomeetest.model.ProductDao;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Douglas
 */
@Stateless
@Path("product")
public class ProductResource implements Serializable {

    @Inject
    private ProductDao dao;

    @GET
    @Produces("application/json")
    public List<Product> getProducts() {
        return dao.listAll();
    }
}
