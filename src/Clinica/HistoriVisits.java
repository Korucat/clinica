package Clinica;

public class HistoriVisits {
    private User client;
    private Card card;
    private String dateVisit;
    private Doctors doctors;

    public HistoriVisits(User client, Card card, String dateVisit, Doctors doctors) {
        this.client = client;
        this.card = card;
        this.dateVisit = dateVisit;
        this.doctors = doctors;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }



    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(String dateVisit) {
        this.dateVisit = dateVisit;
    }

    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }
}
