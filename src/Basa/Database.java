package Basa;

import Clinica.Card;
import Clinica.Doctors;
import Clinica.HistoriVisits;
import Clinica.User;
import Lib.ArrayListCustom;

import javax.print.Doc;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Database {
    private ArrayListCustom<Card> cards;
    private ArrayListCustom<Doctors> doctors;
    private ArrayListCustom<HistoriVisits> historiVisits;
    private ArrayListCustom<User> users;

    public Database() {
        cards = new ArrayListCustom<>(10);
        doctors = new ArrayListCustom<>(10);
        historiVisits = new ArrayListCustom<>(100);
        users = new ArrayListCustom<>(10);
    }

    public void addUser(User user) {

        for (int i = 0; i < users.getSize(); i++) {
            if (
                    user.equals(
                            users.get(i)
                    )
            ) {
                throw new IllegalArgumentException("Такой пациент уже есть");
            }
        }

        users.add(user);
    }

    public void addDoctor(Doctors doctor) {

        doctors.add(doctor);
    }


    public void addCard(Card card) {

        cards.add(card);
    }

    public void printDoctors() {
        for (int i = 0; i < doctors.getSize(); i++) {
            System.out.println(doctors.get(i));
        }
    }

    public void printUsers() {
        for (int i = 0; i < users.getSize(); i++) {
            System.out.println(users.get(i));
        }

    }

    public boolean isUserExists(String name) {
        for (int i = 0; i < users.getSize(); i++) {
            if (users
                    .get(i)
                    .getName()
                    .equals(name)
            ) {
                return true;
            }
        }

        return false;
    }

    public User getUser(String name) throws IllegalArgumentException {
        for (int i = 0; i < users.getSize(); i++) {
            if (users
                    .get(i)
                    .getName()
                    .equals(name)
            ) {
                return users.get(i);
            }
        }

        throw new IllegalArgumentException("Такого пациента не существует");
    }

    public boolean hasUserCards(User user) {
        for (int i = 0; i < cards.getSize(); i++) {
            if (
                    cards
                            .get(i)
                            .getClient()
                            .equals(user)
            ) {
                return true;
            }
        }
        return false;
    }

    public void printUser() {
        for (int i = 0; i < users.getSize(); i++) {
            System.out.println(users.get(i));
        }


    }

    public void printHistoriVisits() {
        for (int i = 0; i < cards.getSize(); i++) {
            System.out.println(cards.get(i));
        }

        //*  public void addVisits(HistoriVisits visist) {
//
        //         historiVisits.add(visits);
        //  }


    }
}
