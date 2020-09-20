package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldGetAndSet() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldSetCurrentTemperatureOverMax() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(27);
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldSetCurrentTemperatureUnderMin() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(15);
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldSetCurrentTemperatureMax() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(26);
        assertEquals(26, conditioner.getMaxTemperature());
    }

    @Test
    public void shouldSetCurrentTemperatureMin() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(16);
        assertEquals(16, conditioner.getMinTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperatureBetweenMinMax() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();

        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperatureMax() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();

        conditioner.setCurrentTemperature(26);
        assertEquals(26, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(26, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureBetweenMinMax() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();

        conditioner.setCurrentTemperature(18);
        assertEquals(18, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(17, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureMin() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();

        conditioner.setCurrentTemperature(16);
        assertEquals(16, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }
}