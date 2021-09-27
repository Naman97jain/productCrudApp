package productcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import productcrud.dao.ProductDao;
import productcrud.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDaoImpl;
	
	public int create(Product product) {
		return productDaoImpl.create(product);
	}
	
	public void update(Product product, int productId) {
		productDaoImpl.update(product, productId);
	}
	
	public void delete(int productId) {
		productDaoImpl.delete(productId);
	}
	
	public List<Product> getAll(){
		return productDaoImpl.getAllProducts();
	}
	
	public Product getProductById(int productId) {
		return productDaoImpl.getProductById(productId);
	}
}
