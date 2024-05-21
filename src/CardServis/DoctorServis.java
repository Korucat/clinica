package CardServis;

import Basa.Database;
import Clinica.Doctors;

public class DoctorServis {
    private Database database;

    public DoctorServis(Database database) {
        this.database = database;
    }

    public void createDoctor(String nameDoctor, String service, int priceDoctor) {
        if (priceDoctor < 0)
            throw new IllegalArgumentException("Цена не может быть ниже 0");


        Doctors createDoctor = new Doctors(nameDoctor, service, priceDoctor);

        database.addDoctor(createDoctor);

    }

    public void printDoctors() {

        database.printDoctors();
    }


}

