package pkg;

public class CisloMensiNezValidator implements Validator {
    
    private final int cislo;
    private final int limit;

    public CisloMensiNezValidator(int cislo, int limit) {
        this.cislo = cislo;
        this.limit = limit;
    }

    @Override
    public boolean jeValidni() {
        return this.cislo < this.limit;
    }

    @Override
    public void vypisChybu() {
        System.out.println("Číslo " + this.cislo + " není menší než " + this.limit + " !");
    }
    
}
