package Projeto_Interfaces.projeto_01.services;

import Projeto_Interfaces.projeto_01.entities.CarRental;

import java.time.temporal.ChronoUnit;


public class RentalService {
    private double pricePerDay;
    private double pricePerHour;

    public RentalService(double pricePerDay, double pricePerHour) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void processInvoice(CarRental carRental) {
        double value = 0.0;
        long duration = ChronoUnit.HOURS.between(carRental.getFinish(), carRental.getStart());
        if (duration <= 12L) {
            value = this.pricePerHour * duration;
        } else {
            value = this.pricePerDay * duration;
        }
    }
}
