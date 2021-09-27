package productcrud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrud.model.Product;
import productcrud.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/home")
	public String home(Model model) {
		List<Product> products= productService.getAll();
		model.addAttribute("products", products);
		System.out.println(products);
		return "home";
	}
	
	@RequestMapping(path = "/addProduct", method=RequestMethod.GET)
	public String createForm(Model model) {
		model.addAttribute("title", "Add Product");
		return "add-product";
	}
	
	@RequestMapping(path = "/updateProduct/{id}", method=RequestMethod.GET)
	public String updateView(@PathVariable("id") int id , Model model) {
		Product product = productService.getProductById(id);
		model.addAttribute("product", product);
		model.addAttribute("title", "Update Product");
		return "update-product";
	}
		
	@RequestMapping(path = "/handleCreate", method = RequestMethod.POST)
	public RedirectView createHandle(@ModelAttribute Product product, HttpServletRequest req) {
		int productId = productService.create(product);
		System.out.println(productId);
		return redirectToHome(req);
	}
	
	@RequestMapping(path = "/handleUpdate", method=RequestMethod.POST)
	public RedirectView update(@ModelAttribute Product product, HttpServletRequest req) {
		productService.update(product, product.getId());
		return redirectToHome(req);
	}
	
	@RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)
	public RedirectView delete(@PathVariable("id") int productId, HttpServletRequest req) {
		productService.delete(productId);
		return redirectToHome(req);
	}
	
	@RequestMapping(path = "/getAll", method = RequestMethod.GET)
	public RedirectView getAll(Model model, HttpServletRequest req) {
		return redirectToHome(req);
	}
	
	public RedirectView redirectToHome(HttpServletRequest req) {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(req.getContextPath() + "/home");
		return redirectView;
	}
}
