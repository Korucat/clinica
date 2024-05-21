package Clinica;

public class Card {
    private User client;
    private int visits;
    private boolean  sickActive;
    private boolean sickLocked;

    public Card(User client, int visits, boolean sickActive, boolean sickLocked) {
        this.client = client;
        this.visits = visits;
        this.sickActive = sickActive;
        this.sickLocked = sickLocked;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        if (visits < 0)
            throw new IllegalArgumentException("Колличество посещений не может быть отрицательным");

        this.visits = visits;
    }

    public boolean isSickActive() {
        return sickActive;
    }

    public void setSickActive(boolean sickActive) {
        this.sickActive = sickActive;
    }

    public boolean isSickLocked() {
        return sickLocked;
    }

    public void setSickLocked(boolean sickLocked) {
        this.sickLocked = sickLocked;
    }
}
