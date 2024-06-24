package org.ncu.Token.Service;

import java.util.List;
import org.ncu.Token.Dao.Dao;
import org.ncu.Token.Entity.TokenEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    private final Dao dao;

    @Autowired
    public TokenServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public TokenEntity createToken() {
        return dao.createToken();
    }

    @Override
    public TokenEntity getTokenById(int id) {
        return dao.getTokenById(id);
    }

    @Override
    public List<TokenEntity> getAllToken() {
        return dao.getAllToken();
    }

    @Override
    public void deleteToken(int id) {
        dao.deleteToken(id);
    }

    @Override
    public TokenEntity updateToken(int id, String newToken) {
        return dao.updateToken(id, newToken);
    }
}
