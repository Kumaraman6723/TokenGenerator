package org.ncu.Token.Dao;

import java.util.List;
import java.util.Random;

import org.ncu.Token.Entity.TokenEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class DaoImpl implements Dao {

    @PersistenceContext
    private EntityManager entityManager;

    private final Random random = new Random();

    @Override
    public TokenEntity createToken() {
        String token = generateRandomToken();
        TokenEntity tokenEntity = new TokenEntity(token);
        entityManager.persist(tokenEntity);
        return tokenEntity;
    }

    @Override
    public TokenEntity getTokenById(int id) {
        return entityManager.find(TokenEntity.class, id);
    }

    @Override
    public void deleteToken(int id) {
        TokenEntity tokenEntity = getTokenById(id);
        if (tokenEntity != null) {
            entityManager.remove(tokenEntity);
        }
    }

    @Override
    public TokenEntity updateToken(int id, String newToken) {
        TokenEntity tokenEntity = getTokenById(id);
        if (tokenEntity != null) {
            tokenEntity.setToken(newToken);
            entityManager.merge(tokenEntity);
        }
        return tokenEntity;
    }

    @Override
    public List<TokenEntity> getAllToken() {
        TypedQuery<TokenEntity> query = entityManager.createQuery("SELECT m FROM TokenEntity m", TokenEntity.class);
        return query.getResultList();
    }

    private String generateRandomToken() {
        int tokenLength = 10;
        StringBuilder token = new StringBuilder(tokenLength);
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < tokenLength; i++) {
            int index = random.nextInt(characters.length());
            token.append(characters.charAt(index));
        }
        return token.toString();
    }
}
