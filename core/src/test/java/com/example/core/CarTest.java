package com.example.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CarTest {

    @Test
    public void given_when_then() {
        //GIVEN
        var car = new Car();


        //WHEN
        assertNotNull(car);

        //THEN

    }

}