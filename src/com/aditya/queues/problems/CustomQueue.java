package com.aditya.queues.problems;

import java.util.Objects;

public class CustomQueue {
    Integer maxThreshold;
    Integer timePerPerson;
    Integer currentSize;

    public CustomQueue(Integer maxThreshold, Integer currentSize,Integer timePerPerson) {
        this.maxThreshold = maxThreshold;
        this.currentSize = currentSize;
        this.timePerPerson=timePerPerson;
    }



    public Integer getMaxThreshold() {
        return maxThreshold;
    }

    public void setMaxThreshold(Integer maxThreshold) {
        this.maxThreshold = maxThreshold;
    }

    public Integer getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }

    public Integer getTimePerPerson() {
        return timePerPerson;
    }

    public void setTimePerPerson(Integer timePerPerson) {
        this.timePerPerson = timePerPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomQueue)) return false;
        CustomQueue that = (CustomQueue) o;
        return getTimePerPerson() == that.getTimePerPerson() && getMaxThreshold().equals(that.getMaxThreshold()) && getCurrentSize().equals(that.getCurrentSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaxThreshold(), getTimePerPerson(), getCurrentSize());
    }

    @Override
    public String toString() {
        return "CustomQueue{" +
                "maxThreshold=" + maxThreshold +
                ", timePerPerson=" + timePerPerson +
                ", currentSize=" + currentSize +
                '}';
    }
}
