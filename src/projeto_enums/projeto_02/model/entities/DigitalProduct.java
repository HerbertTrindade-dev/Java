package projeto_enums.projeto_02.model.entities;

import java.time.LocalDate;

public class DigitalProduct extends Product {

    private String link;
    private LocalDate dateExpiration;

    public DigitalProduct(String name, Double price, String link, LocalDate dateExpiration) {
        super(name, price);
        this.link = link;
        this.dateExpiration = dateExpiration;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Override
    public double totalValue() {
        return 0;
    }
}
