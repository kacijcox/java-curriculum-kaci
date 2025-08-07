package com.example.demo.data.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "coin_price")

public class CoinPrice {

    public CoinPrice() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column (name = "usd", nullable = false)
    private Integer coinUsd;

    @Column (name = "usd_market_cap", nullable = false)
    private Integer coinUsdMarketCap;

    @Column (name = "usd_24h_vol", nullable = false)
    private Integer coinUsd24Vol;

    @Column (name = "usd_24h_change", nullable = false)
    private Integer coinUsd24Change;

    @Column (name = "last_updated_at", nullable = false)
    private DateTimeFormat coinLastUpdatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCoinUsd() {
        return coinUsd;
    }

    public void setCoinUsd(Integer coinUsd) {
        this.coinUsd = coinUsd;
    }

    public Integer getCoinUsdMarketCap() {
        return coinUsdMarketCap;
    }

    public void setCoinUsdMarketCap(Integer coinUsdMarketCap) {
        this.coinUsdMarketCap = coinUsdMarketCap;
    }

    public Integer getCoinUsd24Vol() {
        return coinUsd24Vol;
    }

    public void setCoinUsd24Vol(Integer coinUsd24Vol) {
        this.coinUsd24Vol = coinUsd24Vol;
    }

    public Integer getCoinUsd24Change() {
        return coinUsd24Change;
    }

    public void setCoinUsd24Change(Integer coinUsd24Change) {
        this.coinUsd24Change = coinUsd24Change;
    }

    public DateTimeFormat getCoinLastUpdatedAt() {
        return coinLastUpdatedAt;
    }

    public void setCoinLastUpdatedAt(DateTimeFormat coinLastUpdatedAt) {
        this.coinLastUpdatedAt = coinLastUpdatedAt;
    }
}
