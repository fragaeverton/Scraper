package co.evertonfraga.scraper.services;

import co.evertonfraga.scraper.entities.Product;
import lombok.AllArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

@AllArgsConstructor
public class JsoupService implements Scraper {

    @Override
    public Product getProduct(String url) {

        Product product = new Product();

        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
            //System.out.println(doc.body());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements newsHeadlines = doc.select("#mp-itn b a");
        return new Product(1, "Nome");
    }

}
