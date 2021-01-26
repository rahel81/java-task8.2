package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void CurrentNumberStation() {
        radio.setCurrentNumberStation(9);
        assertEquals(9, radio.getCurrentNumberStation());
    }

    @Test
    void nextNumberStation() {
        radio.setCurrentNumberStation(7);
        radio.nextNumberStation();
        assertEquals(8, radio.getCurrentNumberStation());
    }

    @Test
    void prevNumberStation() {
        radio.setCurrentNumberStation(7);
        radio.prevNumberStation();
        assertEquals(6, radio.getCurrentNumberStation());
    }

    @Test
    void LastStation() {
        radio.setCurrentNumberStation(9);
        radio.nextNumberStation();
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void StartStation() {
        radio.setCurrentNumberStation(0);
        radio.prevNumberStation();
        assertEquals(9, radio.getCurrentNumberStation());
    }

    @Test
    void NextNumberStationOverLast() {
        radio.setCurrentNumberStation(11);
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void PrevNumberStationUnderStart() {
        radio.setCurrentNumberStation(-1);
        assertEquals(0, radio.getCurrentNumberStation());
    }
}