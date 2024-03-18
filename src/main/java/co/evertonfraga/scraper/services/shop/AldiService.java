package co.evertonfraga.scraper.services.shop;

import co.evertonfraga.scraper.entities.Props;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AldiService implements Shop {


    @Override
    public Props getName() {
        Props props = new Props();
        props.setContent("._desc");
        props.setSource("text");
        return props;
    }

    @Override
    public Props getImage() {
        Props props = new Props();
        props.setContent("._img");
        props.setSource("src");
        return props;
    }

    @Override
    public Props getPrice() {
        Props props = new Props();
        props.setContent(".comparison-table b");
        props.setSource("text");
        return props;
    }
}
