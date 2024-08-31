package me.dio.santander_dev_work.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_card")

public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;


    @Column(name = "available_limit", precision = 13, scale = 2)
    private Number limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Number getLimit() {
        return limit;
    }

    public void setLimit(Number limit) {
        this.limit = limit;
    }
}
