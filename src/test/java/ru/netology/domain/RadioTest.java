package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void shouldStationNext() {  ///выбор следующей станции
        Radio radio = new Radio(0,10);
        radio.stationUp();
        assertEquals(1, radio.getStationNumber());

    }

    @Test
    void shouldStationPrev() {  ///выбор предыдущий станции
       Radio radio = new Radio(5,10);
        radio.statioDown();
        assertEquals(4, radio.getStationNumber());
    }

    @Test
    void shouldStationUpWhenStationMax() { /// переход станции после максимальной
        Radio radio = new Radio (10,10);
        radio.stationUp();
        assertEquals(0, radio.getStationNumber());
    }

    @Test
    void shouldStationDownWhenStationMin() { /// переход станции после минимальной
        Radio radio = new Radio(0,10);
        radio.statioDown();
        assertEquals(10, radio.getStationNumber());
    }

    @Test
    void shouldSetStationNumber() { //выбор станции
        Radio radio = new Radio(5,5);
        assertEquals(5, radio.getStationNumber());

    }

    @Test
    void shouldVolumUp() {  ///увелечение звука на одну единицу
        Radio radio = new Radio(2,50);
        radio.volumeUp();
        assertEquals(51, radio.getVolume());
    }

    @Test
    void shouldVolumDown() {  ///уменьшение звука на одну единицу
        Radio radio =new Radio(2,50);
        radio.volumeDown();
        assertEquals(49 , radio.getVolume());
    }
    @Test
    void shouldVolumeUpWhenVolumeMax() { ///увелечение звука после максимальной громкости (10)
        Radio radio = new Radio(2,100);
        radio.volumeUp();
        assertEquals(100, radio.getVolume());
    }
    @Test
        void shouldVolumeUpWhenVolumenMin () { ///уменьшение звука после минимальной громкости (0)
        Radio radio = new Radio(2,0);
        radio.volumeDown();
        assertEquals(0, radio.getVolume());

    }
}