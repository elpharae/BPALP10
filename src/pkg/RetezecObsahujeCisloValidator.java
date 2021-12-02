package pkg;

public class RetezecObsahujeCisloValidator implements Validator {

    private final String text;

    public RetezecObsahujeCisloValidator(String text) {
        this.text = text.trim();
    }
    
    
    @Override
    public boolean jeValidni() {
        boolean result = false;
        for(char c : text.toCharArray()) if (Character.isDigit(c)) {
            result = true;
            break;
        }
        return result;
    }

    @Override
    public void vypisChybu() {
        System.out.println("Řetězec (" + this.text + ") neobsahuje žádné číslo !");
    }
    
}
