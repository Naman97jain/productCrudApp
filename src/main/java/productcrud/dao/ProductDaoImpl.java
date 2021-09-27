package productcrud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import productcrud.model.Product;

public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public List<Product> getAllProducts() {
		return hibernateTemplate.loadAll(Product.class);
		
	}

	@Transactional
	public int create(Product product) {
		int productId = (Integer) this.hibernateTemplate.save(product);
		return productId;
	}

	@Transactional
	public void update(Product product, int productId) {
		// TODO Auto-generated method stub
//		Product product = getProductById(productId);
		this.hibernateTemplate.update(product);

	}

	@Transactional
	public void delete(int productId) {
		// TODO Auto-generated method stub
		Product product = getProductById(productId);
		this.hibernateTemplate.delete(product);
	}

	public Product getProductById(int productId) {
		Product product = this.hibernateTemplate.get(Product.class, productId);
		return product;
	}

}
