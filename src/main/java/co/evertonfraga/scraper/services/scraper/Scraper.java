package co.evertonfraga.scraper.services.scraper;

import co.evertonfraga.scraper.entities.Product;

public interface Scraper {

    Product getProduct(Product product);
}
