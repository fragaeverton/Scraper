package co.evertonfraga.scraper.services.shop;

import co.evertonfraga.scraper.entities.Props;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LidlService implements Shop {


    @Override
    public Props getName() {
        Props props = new Props();
        props.setContent("");
        props.setSource("");
        return props;
    }

    @Override
    public Props getImage() {
        Props props = new Props();
        props.setContent("");
        props.setSource("");
        return props;
    }

    @Override
    public Props getPrice() {
        Props props = new Props();
        props.setContent("");
        props.setSource("");
        return props;
    }
}
