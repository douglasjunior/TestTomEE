package br.edu.utfpr.cp.tomeetest.task;

import br.edu.utfpr.cp.tomeetest.model.Product;
import br.edu.utfpr.cp.tomeetest.model.ProductDao;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author Douglas
 */
@Singleton
@Startup
public class ProductJob implements Serializable {

    @Inject
    private ProductDao dao;

    @Schedule(hour = "*", minute = "*", second = "*/5", persistent = false)
    public void task() {
        List<Product> result = dao.listAll();
        System.out.println("Task products: " + result);
    }

}
