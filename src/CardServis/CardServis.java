package CardServis;

import Basa.Database;
import Clinica.Card;
import Clinica.User;

public class CardServis {
    private Database database;

    public CardServis(Database database) {
        this.database = database;
    }


    public boolean hasAnyCards(User user) {
        return database.hasUserCards(user);
    }

    public void createCard(User user) {
        Card card = new Card(user, 0, true,     false);

        database.addCard(card);
    }


}
