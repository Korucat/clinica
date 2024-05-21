package Clinica;

public class Doctors {
    private String nameDoctor;
    private String service;
    private int priceDoctor;

    public Doctors(String nameDoctor, String service, int priceDoctor) {
        this.nameDoctor = nameDoctor;
        this.service = service;
        this.priceDoctor = priceDoctor;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getPriceDoctor() {
        return priceDoctor;
    }

    public void setPriceDoctor(int priceDoctor) {
        if (priceDoctor < 0)
            throw new IllegalArgumentException("Цена не может быть отрицательной");

        this.priceDoctor = priceDoctor;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "Имя доктора='" + nameDoctor + '\'' +
                ",Прайс=" + priceDoctor +
                ", Специальность='" + service + '\'' +
                '}';
    }
}
