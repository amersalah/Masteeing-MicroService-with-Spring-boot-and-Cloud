package com.amer.microservices.currencyexchangeservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "EXCHANGE_VALUE")
public class ExchangeValue {

    @Id
    private Long id;
    @Column(name = "currency_from")
    private String from;
    @Column(name = "currency_to")
    private String to;
    private BigDecimal conversionMultible;
    private int port;

    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultible) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultible = conversionMultible;
    }

    public ExchangeValue() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultible() {
        return conversionMultible;
    }

    public void setConversionMultible(BigDecimal conversionMultible) {
        this.conversionMultible = conversionMultible;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}