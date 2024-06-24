package org.ncu.Token.Controller;

import java.util.List;
import org.ncu.Token.Entity.TokenEntity;
import org.ncu.Token.Service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/tokens")
public class TokenController {

    private final TokenService tokenService;

    @Autowired
    public TokenController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/create")
    public TokenEntity createToken() {
        return tokenService.createToken();
    }

    @GetMapping("/get/{id}")
    public TokenEntity getToken(@PathVariable int id) {
        return tokenService.getTokenById(id);
    }

    @GetMapping("/get")
    public List<TokenEntity> getAllToken() {
        return tokenService.getAllToken();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteToken(@PathVariable int id) {
        tokenService.deleteToken(id);
    }

    @PutMapping("/update/{id}")
    public TokenEntity updateToken(@PathVariable int id, @RequestBody String newToken) {
        return tokenService.updateToken(id, newToken);
    }
}
