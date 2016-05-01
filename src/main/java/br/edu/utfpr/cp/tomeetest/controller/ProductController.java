package br.edu.utfpr.cp.tomeetest.controller;

import br.edu.utfpr.cp.tomeetest.model.Product;
import br.edu.utfpr.cp.tomeetest.model.ProductDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Douglas
 */
@Named
@ViewScoped
public class ProductController implements Serializable {

    @Inject
    private ProductDao dao;

    public List<Product> getProducts() {
        return dao.listAll();
    }
}
