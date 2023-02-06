public class Main {
    public static void main(String[] args) {
Person  person=new Person();
person.setFirstName("Mamatkarimov");
person.setLastName("Abjal");
person.setAge(27);
person.setGender('M');

Adres adres=new Adres();
adres.setRaion("Kara-zhygach");
adres.setKocho("Kerege-Tash");
adres.setHomNumber("14 dom");

City city=new City();
city.setOblast("Chui");
city.setCity("Bishkek");

Country country=new Country();
country.setCountry("Kyrgyzstan");

        Country [] countries={country};
        for (Country county:countries) {
            System.out.println("Country:"+county.getCountry());
        }
        City [] cityes={city};
        for (City citi:cityes) {
            System.out.println("Oblast:"+citi.getOblast()+", City:"+citi.getCity());
        }
        Adres [] adress={adres};
        for (Adres adrres:adress) {
            System.out.println("Raion:"+adrres.getRaion()+", Kocho:"+adrres.getKocho()+", Dom:"+adrres.getHomNumber());
        }
Person [] persona={person};
        for (Person p:persona) {
            System.out.println("Familia:"+p.getFirstName()+", Atu:"+p.getLastName()+", Jashu:"+p.getAge()+", Pol:"+p.getGender());
        }
    }
}