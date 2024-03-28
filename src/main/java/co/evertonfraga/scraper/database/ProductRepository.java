package co.evertonfraga.scraper.database;

import co.evertonfraga.scraper.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // define custom query methods if needed
    //Product findById(int id);
    @Query("SELECT p FROM Product p LEFT JOIN p.nicknames n WHERE n.id IS NULL")
    List<Product> findProductsWithoutNicknames();
    @Query("SELECT p FROM Product p WHERE p.name LIKE %:name%")
    List<Product> findByName(@Param("name") String name);
}