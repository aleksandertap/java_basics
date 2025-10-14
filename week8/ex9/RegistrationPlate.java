package week8.ex9;

public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.country = country;
        this.regCode = regCode;
    }

    public String toString(){
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if (!this.country.equals(compared.country)) {
            return false;
        }

        if (!this.regCode.equals(compared.regCode)) {
            return false;
        }

        return true;
    }


    @Override
    public int hashCode() {
        int result = 17;

        if (country != null) {
            result = 31 * result + country.hashCode();
        }

        if (regCode != null) {
            result = 31 * result + regCode.hashCode();
        }

        return result;
    }
}