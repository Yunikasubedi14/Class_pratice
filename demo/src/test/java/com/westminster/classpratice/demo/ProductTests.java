
package com.westminster.classpratice.demo;

import org.junit.jupiter.api.Test;
import com.westminster.classpratice.demo.productapi.Product;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTests {

    @Test
    public void testProduct() {

        Product product = new Product(11, "Laptop", 20, true, 12.33);

        assertEquals(11, product.getId());
        assertEquals("Laptop", product.getName());
    }
}
