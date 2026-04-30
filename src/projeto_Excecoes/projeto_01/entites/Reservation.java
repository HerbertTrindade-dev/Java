package projeto_Excecoes.projeto_01.entites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public long duration(){
        long qtdDays = ChronoUnit.DAYS.between(checkIn,checkOut);
        return qtdDays;
    }

    @Override
    public String toString(){
        return "Reserva:\nQuarto "
                +this.roomNumber
                +"\n-Check-In:"
                +this.checkIn.format(fmt)
                +"\n-Check-Out:"+this.checkOut.format(fmt)
                +"\n-"
                +duration()
                +" noites";
    }
}
