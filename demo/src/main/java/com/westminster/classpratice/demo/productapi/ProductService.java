
package com.westminster.classpratice.demo.productapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();
    private int nextId = 1;

    // Get all products
    public List<Product> getAllProducts() {
        return products;
    }

    // Get product by ID
    public Optional<Product> getProductById(int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
    }

    // Find products by name
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }

    // Add product
    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    // Add inherited products
    public List<Product> addGetInheritedProduct() {

        Product dp = new DigitalProduct(
                112,
                "Digital Product",
                2,
                true,
                34.99,
                "http://xsdfa.com/file/3434",
                23.33
        );

        Product physicalProduct = new PhysicalProduct(
                122,
                "Physical Product",
                3,
                true,
                11.99,
                3.09,
                "20x10"
        );

        products.add(dp);
        products.add(physicalProduct);

        return products;
    }

    // Part 5: Add ServiceProduct
    public ServiceProduct addServiceProduct() {

        ServiceProduct serviceProduct = new ServiceProduct(
                nextId++,
                "Web Development Service",
                1,
                true,
                5000.00,
                120,
                "ABC Solutions",
                true
        );

        products.add(serviceProduct);

        return serviceProduct;
    }

    // Part 5: Get only ServiceProducts
    public List<ServiceProduct> getServiceProducts() {

        return products.stream()
                .filter(product -> product instanceof ServiceProduct)
                .map(product -> (ServiceProduct) product)
                .toList();
    }

    // Delete product
    public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    // Apply discounts
    public void applyDiscounts(List<Product> products) {

        products.forEach(product -> {
            if (product instanceof Discountable) {
                ((Discountable) product).applyDiscount(10.0);
            }
        });
    }

    // Get discounted products
    public List<Product> getDiscountedProducts() {
        return products;
    }

    // Part 7: Demonstrate Runtime Polymorphism
    public void demonstratePolymorphism() {

        // Parent reference holding child object
        Product product = new ServiceProduct(
                10,
                "Web Development Service",
                1,
                true,
                5000.00,
                120,
                "ABC Solutions",
                true
        );

        // Calling overridden methods using parent reference
        System.out.println(product.getSummary());

        System.out.println(product.onFulfillOrder());
    }
}
