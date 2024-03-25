package co.evertonfraga.scraper.database;

import co.evertonfraga.scraper.entities.Product;
import co.evertonfraga.scraper.entities.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Integer> {
    // define custom query methods if needed
    //Product findById(int id);
}