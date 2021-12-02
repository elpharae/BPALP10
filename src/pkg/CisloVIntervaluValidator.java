package pkg;

public class CisloVIntervaluValidator implements Validator {
    
    private final int cislo;
    private final int min;
    private final int max;

    public CisloVIntervaluValidator(int cislo, int min, int max) {
        this.cislo = cislo;
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean jeValidni() {
        return this.cislo > this.min && this.cislo < this.max;
    }

    @Override
    public void vypisChybu() {
        System.out.println("Číslo se nenachází v intervalu (" + this.min + ";" + this.max + ") !");
    }
    
    
    
}
