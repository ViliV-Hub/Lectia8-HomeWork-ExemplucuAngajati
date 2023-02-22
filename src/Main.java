import office.Angajat;
import office.Companie;

public class Main {
    public static void main(String[] args) {

        Companie companie = new Companie();

        Angajat angajati[] = new Angajat[20];
        angajati[0] = new Angajat("Ion", 15000);
        angajati[1] = new Angajat("Vasile", 25000);

        companie.addNewOffice("Oficiul1", "Back Office", angajati);

        Angajat angajati2[] = new Angajat[20];
        angajati2[0] = new Angajat("Tudor", 20000);
        angajati2[1] = new Angajat("MIhai", 30000);

        companie.addNewOffice("Oficiul 2", "IT Departament", angajati2);

        System.out.println("Salariu Mediu per Angajat: " + companie.calculeazaSalariuMediuAngajat());
    }
}