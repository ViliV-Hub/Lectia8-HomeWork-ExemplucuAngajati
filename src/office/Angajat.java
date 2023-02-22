package office;

public class Angajat {
    private String nume;
    private int salariu;

    public Angajat(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
}
