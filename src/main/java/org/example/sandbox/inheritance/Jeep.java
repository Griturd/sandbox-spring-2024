package org.example.sandbox.inheritance;

import java.awt.*;

public class Jeep extends SportUtilityVehicle {

    private Color color;
    protected Double gasMileage;
    private Double towingCapacity;

    public Jeep() {
    }

    public Jeep(Color color, Double gasMileage, Double towingCapacity) {
        this.color = color;
        this.gasMileage = gasMileage;
        this.towingCapacity = towingCapacity;
    }

    public Color getColor() {
        return color;
    }

    public Double getGasMileage() {
        return gasMileage;
    }

    public Double getTowingCapacity() {
        return towingCapacity;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setGasMileage(Double gasMileage) {
        this.gasMileage = gasMileage;
    }

    public void setTowingCapacity(Double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public int getNumberOfSeats() {
        return numberOfSeats + 1;
    }

    @Override
    public void transport() {

    }

}
