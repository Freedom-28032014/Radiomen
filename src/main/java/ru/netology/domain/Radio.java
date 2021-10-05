package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStation;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int amountStation = 10;

    public Radio() {
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minStation) {
            return;
        }
        if (currentRadioStation > amountStation - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < amountStation - 1) {
            currentRadioStation = currentRadioStation + 1;
        } else
            currentRadioStation = minStation;
    }

    public void prevRadioStation() {
        if (currentRadioStation > minStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = amountStation - 1;

        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }



    public void VolumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }

    }

    public void VolumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }

    }
}








