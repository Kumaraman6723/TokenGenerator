package org.ncu.Token.Service;

import java.util.List;
import org.ncu.Token.Entity.TokenEntity;

public interface TokenService {
    TokenEntity createToken();
    TokenEntity getTokenById(int id);
    List<TokenEntity> getAllToken();
    void deleteToken(int id);
    TokenEntity updateToken(int id, String newToken);
}
