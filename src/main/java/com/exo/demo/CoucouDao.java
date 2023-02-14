package com.exo.demo;

import java.util.Random;

import org.springframework.stereotype.Repository;

@Repository
public class CoucouDao implements CoucouInterface {
    String[] DATA = { "coucou", "salut", "hello" };

    @Override
    public String getRandomCoucou() {
        int i = new Random().nextInt(DATA.length);
        return DATA[i];
    }
}
