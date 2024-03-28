package co.evertonfraga.scraper.database;
import co.evertonfraga.scraper.entities.Nickname;
import co.evertonfraga.scraper.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NicknameService {

    private final NicknameRepository nicknameRepository;

    @Autowired
    public NicknameService(NicknameRepository nicknameRepository) {
        this.nicknameRepository = nicknameRepository;
    }

    public List<Nickname> nicknameList() {
        return nicknameRepository.findAll();
    }
    // other service methods as needed

    public Nickname saveNickname(Nickname nickname) {
        return nicknameRepository.save(nickname);
    }
}