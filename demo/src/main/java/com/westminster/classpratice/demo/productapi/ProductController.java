
package com.westminster.classpratice.demo.productapi;

import org.springframework.web.bind.annotation.*;

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
                .orElse(null); // Lecture 6
    }

    @PostMapping("/")
    public Product add(@RequestBody Product product) {
        return productService.addProduct(product);
    }

}