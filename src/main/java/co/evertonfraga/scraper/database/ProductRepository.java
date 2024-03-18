package co.evertonfraga.scraper.database;

import co.evertonfraga.scraper.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // define custom query methods if needed
    //Product findById(int id);
}