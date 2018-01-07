package DesignPattern.Mediator;

public class UnitedNationsSecurityCouncil extends UnitedNation{
    private Country countryUSA;
    private Country countryChina;

    @Override
    public void Declare(String msg, Country country) {
        if(country == countryChina){
            countryUSA.GetMessage(msg);
        }else{
            countryChina.GetMessage(msg);
        }
    }

    public Country getCountryUSA() {
        return countryUSA;
    }

    public void setCountryUSA(Country countryUSA) {
        this.countryUSA = countryUSA;
    }

    public Country agetCountryChina() {
        return countryChina;
    }

    public void setCountryChina(Country countryChina) {
        this.countryChina = countryChina;
    }
}
