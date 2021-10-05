package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();


    @Test
    void shouldStationNext() {  ///выбор следующей станции
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());

    }

    @Test
    void shouldStationPrev() {  ///выбор предыдущий станции
        radio.setCurrentRadioStation(3);
        radio.prevRadioStation();
        int expected = 2;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldStationUpWhenStationMax() { /// переход станции после максимальной
        radio.setCurrentRadioStation(11);
        int expected = radio.getCurrentRadioStation();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    void shouldStationDownWhenStationMin() { /// переход станции после минимальной
        int expected = radio.getCurrentRadioStation();
        radio.setCurrentRadioStation(radio.getMinStation()-3);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    void shouldTheStationByButtonIfCurrentNull() { //выбор станции , если текущая 0
        radio.setCurrentRadioStation(radio.getMinStation());
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());

    }
    @Test
    void shouldTheStationByButtonNextIfCurrentIsNine() { //выбор станции, если текущая 9
        int expected = radio.getCurrentRadioStation();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(expected,radio.getCurrentRadioStation());
    }

    @Test
    void shouldVolumUp() {  ///увелечение звука на одну единицу
        radio.VolumeUp();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumDown() {  ///уменьшение звука на одну единицу
        radio.setCurrentVolume(3);
        int expected = 2;
        radio.VolumeDown();
        assertEquals(expected , radio.getCurrentVolume());
    }
    @Test
    void shouldVolumeUpWhenVolumeMax() { ///увелечение звука после максимальной громкости (10)
        radio.setCurrentVolume(100);
        int expected = 100;
        radio.VolumeUp();
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
        void shouldVolumeUpWhenVolumenMin () { ///уменьшение звука после минимальной громкости (0)
        radio.setCurrentVolume(0);
        radio.VolumeDown();
        assertEquals(0,radio.getCurrentVolume());
    }
}
