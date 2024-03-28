package co.evertonfraga.scraper.database;

import co.evertonfraga.scraper.entities.Nickname;
import co.evertonfraga.scraper.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NicknameRepository extends JpaRepository<Nickname, Integer> {
    // define custom query methods if needed
    Nickname findById(int id);
}