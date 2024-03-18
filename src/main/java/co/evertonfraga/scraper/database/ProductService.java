package co.evertonfraga.scraper.database;
import co.evertonfraga.scraper.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService{

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> productList() {
        return productRepository.findAll();
    }
    // other service methods as needed
}