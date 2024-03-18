package co.evertonfraga.scraper.services.shop;

import co.evertonfraga.scraper.entities.Props;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CostcoService implements Shop {


    @Override
    public Props getName() {
        Props props = new Props();
        props.setContent(".product-name");
        props.setSource("text");
        return props;
    }

    @Override
    public Props getImage() {
        Props props = new Props();
        props.setContent(".image-zoom-container img");
        props.setSource("src");
        return props;
    }

    @Override
    public Props getPrice() {
        Props props = new Props();
        props.setContent(".product-price-exvat-amount ng-star-inserted");
        props.setSource("text");
        return props;
    }
}
