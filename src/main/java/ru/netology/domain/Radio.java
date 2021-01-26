package ru.netology.domain;

public class Radio {
    private String name;
    private int currentNumberStation;
    private int lastStation = 9;
    private int startStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private boolean on;

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation > lastStation) {
            return;
        }
        if (currentNumberStation < startStation) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void nextNumberStation() {
        if (currentNumberStation == lastStation) {
            this.currentNumberStation = startStation;
        } else {
            currentNumberStation++;
        }
    }

    public void prevNumberStation() {
        if (currentNumberStation == startStation) {
            this.currentNumberStation = lastStation;
        } else {
            currentNumberStation--;
        }
    }
}
