package org.ncu.Token.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "token_table")
public class TokenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "token_id")
    private int tokenId;

    @Column(length = 50, nullable = false)
    private String token;

    // No-argument constructor for JPA
    public TokenEntity() {
    }

    // Constructor with token parameter
    public TokenEntity(String token) {
        this.token = token;
    }

    public int getTokenId() {
        return tokenId;
    }

    public void setTokenId(int tokenId) {
        this.tokenId = tokenId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "TokenEntity{" +
                "tokenId=" + tokenId +
                ", token='" + token + '\'' +
                '}';
    }
}
