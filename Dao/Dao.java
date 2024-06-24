package org.ncu.Token.Dao;

import java.util.List;

import org.ncu.Token.Entity.TokenEntity;

public interface Dao {

    List<TokenEntity> getAllToken();
    TokenEntity createToken();
    TokenEntity getTokenById(int id);
    void deleteToken(int id);
    TokenEntity updateToken(int id, String newToken);
}
