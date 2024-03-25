package co.evertonfraga.scraper.database;
import co.evertonfraga.scraper.entities.Product;
import co.evertonfraga.scraper.entities.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {

    private final ShopRepository shopRepository;

    @Autowired
    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public List<Shop> shops() {
        return shopRepository.findAll();
    }
    // other service methods as needed

}