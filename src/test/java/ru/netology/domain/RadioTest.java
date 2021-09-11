package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void shouldStationNext() {  ///выбор следующей станции
        radio.setStationNumber(0);
        radio.stationUp();
        assertEquals(1, radio.getStationNumber());

    }

    @Test
    void shouldStationPrev() {  ///выбор предыдущий станции
        radio.setStationNumber(5);
        radio.statioDown();
        assertEquals(4, radio.getStationNumber());
    }

    @Test
    void shouldStationUpWhenStationMax() { /// переход станции после максимальной
        radio.setStationNumber(9);
        radio.stationUp();
        assertEquals(0, radio.getStationNumber());
    }

    @Test
    void shouldStationDownWhenStationMin() { /// переход станции после минимальной
        radio.setStationNumber(0);
        radio.statioDown();
        assertEquals(9, radio.getStationNumber());
    }

    @Test
    void shouldSetStationNumber() { //выбор станции
        radio.setStationNumber(5);
        assertEquals(5, radio.getStationNumber());

    }

    @Test
    void shouldVolumUp() {  ///увелечение звука на одну единицу
        radio.setVolume(2);
        radio.volumeUp();
        assertEquals(3, radio.getVolume());
    }

    @Test
    void shouldVolumDown() {  ///уменьшение звука на одну единицу
        radio.setVolume(4);
        radio.volumeDown();
        assertEquals(3 , radio.getVolume());
    }
    @Test
    void shouldVolumeUpWhenVolumeMax() { ///увелечение звука после максимальной громкости (10)
        radio.setVolume(10);
        radio.volumeUp();
        assertEquals(10, radio.getVolume());
    }
    @Test
        void shouldVolumeUpWhenVolumenMin () { ///уменьшение звука после минимальной громкости (0)
        radio.setVolume(0);
        radio.volumeDown();
        assertEquals(0, radio.getVolume());

    }
}