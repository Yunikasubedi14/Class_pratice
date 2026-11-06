
package com.westminster.classpratice.demo.productapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public List<Product> all() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable int id) {
        return productService.getProductById(id)
                .orElse(null);
    }

    @PostMapping("/")
    public Product add(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/inherited")
    public List<Product> inherited() {
        return productService.addGetInheritedProduct();
    }

    // Display product summaries using method overriding
    @GetMapping("/override")
    public List<String> override() {

        productService.addGetInheritedProduct();

        List<String> overrideList = new ArrayList<>();

        productService.getAllProducts().forEach(product -> {
            overrideList.add(product.getSummary());
        });

        return overrideList;
    }

    // Apply discounts and return products
    @GetMapping("/getDiscountedProducts")
    public List<Product> applyDiscount() {

        List<Product> products =
                productService.addGetInheritedProduct();

        productService.applyDiscounts(products);

        return productService.getDiscountedProducts();
    }

    // Create a sample ServiceProduct
    @PostMapping("/services")
    public ServiceProduct addServiceProduct() {
        return productService.addServiceProduct();
    }

    // Get all ServiceProducts
    @GetMapping("/services")
    public List<ServiceProduct> getServiceProducts() {
        return productService.getServiceProducts();
    }
}
