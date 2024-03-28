package co.evertonfraga.scraper.database;

import co.evertonfraga.scraper.entities.Nickname;
import co.evertonfraga.scraper.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nicknames")
public class NicknameController {

    private final NicknameService nicknameService;

    @Autowired
    public NicknameController(NicknameService nicknameService) {
        this.nicknameService = nicknameService;
    }

    @PostMapping
    public ResponseEntity<Nickname> saveNickname(@RequestBody Nickname nickname) {
        Nickname savedNickname = nicknameService.saveNickname(nickname);
        return new ResponseEntity<>(savedNickname, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Nickname>> getAllNicknames() {
        List<Nickname> nicknames = nicknameService.nicknameList();
        return new ResponseEntity<>(nicknames, HttpStatus.OK);
    }


}