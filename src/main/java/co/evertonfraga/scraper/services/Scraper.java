package co.evertonfraga.scraper.services;

import co.evertonfraga.scraper.entities.Product;

public interface Scraper {

    Product getProduct(String url);
}
