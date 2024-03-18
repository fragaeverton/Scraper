package co.evertonfraga.scraper.services.scraper;

import co.evertonfraga.scraper.entities.Product;

public class ScraperService {

    private Scraper scraper;

    public ScraperService(Scraper scraper){
        super();
        this.scraper = scraper;
    }

    public Product getProduct(Product product) {
        return scraper.getProduct(product);
    }
}
