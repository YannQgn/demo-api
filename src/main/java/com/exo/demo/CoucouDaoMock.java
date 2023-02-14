package com.exo.demo;

import org.springframework.stereotype.Repository;

@Repository
public class CoucouDaoMock implements CoucouInterface {

    @Override
    public String getRandomCoucou() {
        return "MOCK";
    }
}
