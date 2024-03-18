package co.evertonfraga.scraper.services.shop;

import co.evertonfraga.scraper.entities.Props;
import co.evertonfraga.scraper.services.scraper.Scraper;

public class ShopService {

    private Shop shop;

    public ShopService(Shop shop){
        super();
        this.shop = shop;
    }

    public Props getName() {
        return shop.getName();
    }

    public Props getImage() {
        return shop.getImage();
    }

    public Props getPrice() {
        return shop.getPrice();
    }
}
