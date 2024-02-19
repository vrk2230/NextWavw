package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;

@RestController
public class MyController {
    MyService myService;
    @GetMapping("/players")
    ArrayList<Player> getAllPlayers() {
        return myService.getAllPlayers();
    }

    @GetMapping("/players/{playerId}")
    public void getAllPlayerById(@PathVariable ("playerId") int playerId) {
        myService.getPlayerbyId(playerId);
    }

    @PostMapping("/players")
    public void addPlayer(Player player) {
        myService.addPlayer(player);
    }

    @PutMapping("/players/{playerId}")
    public void updatePlayer(@PathVariable ("playerId") int playerId, @RequestBody Player player) {
        myService.updatePlayer(playerId,player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable ("playerId") int playerId) {
        myService.deletePlayer(playerId);
    }

}
