package pkg;

public class Validatorovna {

    private Validator[] validatory;
    private int pocetValidatoru;

    public Validatorovna(int kapacita) {
        this.validatory = new Validator[kapacita];
        this.pocetValidatoru = 0;
    }

    public void pridejValidator(Validator v) {
        if (this.pocetValidatoru < this.validatory.length) this.validatory[this.pocetValidatoru++] = v;
        else System.out.println("Nelze přidat validator");
    }

    public void zvalidujVse() {
        for (Validator v : this.validatory)
            if (v != null && !(v.jeValidni())) v.vypisChybu();
    }
}