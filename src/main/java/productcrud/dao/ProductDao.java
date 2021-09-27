package productcrud.dao;

import java.util.List;

import productcrud.model.Product;

public interface ProductDao {
	public List<Product> getAllProducts();
	public int create(Product product);
	public void update(Product product, int productId);
	public void delete(int productId);
	public Product getProductById(int productId);
}
