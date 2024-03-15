package co.evertonfraga.scraper.services;

import co.evertonfraga.scraper.entities.Product;

public class ScraperService {

    private Scraper scraper;

    public ScraperService(Scraper scraper){
        super();
        this.scraper = scraper;
    }

    public Product getProduct(String url) {
        return scraper.getProduct(url);
    }
}
