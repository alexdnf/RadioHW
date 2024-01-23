package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSelectCountOfStations() {
        Radio rad = new Radio(10);

        Assertions.assertEquals(10, rad.getCountOfStations());
    }
    @Test
    public void shouldSetStationOf20() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(15);

        Assertions.assertEquals(15, rad.getCurrentStation());
    }


    @Test
    public void shouldSetStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);

        int expected = 5;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);
        rad.increaseVolume();

        int expected = 51;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(40);
        rad.decreaseVolume();

        int expected = 39;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);
        rad.nextStation();

        int expected = 6;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(7);
        rad.prevStation();

        int expected = 6;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(rad.getMaxVolume());
        rad.increaseVolume();

        int expected = rad.getMaxVolume();
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(rad.getMinVolume());
        rad.decreaseVolume();

        int expected = rad.getMinVolume();
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetToZeroStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(rad.getMaxStation());
        rad.nextStation();

        int expected = rad.getMinStation();
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetToLastStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(rad.getMinStation());
        rad.prevStation();

        int expected = rad.getMaxStation();
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeSubMin() {

        Radio rad = new Radio();

        rad.setCurrentVolume(-5);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetVolumeAboveMax() {

        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(21);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetStationSubMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(-5);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
}
