package co.evertonfraga.scraper.services.shop;

import co.evertonfraga.scraper.entities.Product;
import co.evertonfraga.scraper.entities.Props;

public interface Shop {

    Props getName();

    Props getImage();

    Props getPrice();
}
