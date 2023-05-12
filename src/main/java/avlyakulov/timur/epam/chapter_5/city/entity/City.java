package avlyakulov.timur.epam.chapter_5.city.entity;

import java.util.Arrays;

/*
Создать класс City с внутренним классом, с помощью объектов которого
можно хранить информацию о проспектах, улицах, площадях.
 */
public class City {
    private final String name;
    private CityDistrict[] cityDistricts;
    private final int population;
    private final boolean isCapital;

    private int current;

    public City (String name, int population) {
        this.name = name;
        cityDistricts = new CityDistrict[1];
        this.population = population;
        isCapital = this.name.toLowerCase().equals("kiev");
    }

    public void addToCityDistrict (CityDistrict cityDistrict) {
        if (current == cityDistricts.length) {
            CityDistrict[] cityDistrict1 = new CityDistrict[cityDistricts.length + 1];
            System.arraycopy(cityDistricts,0,cityDistrict1,0,cityDistricts.length);
            cityDistricts = cityDistrict1;
        }
        cityDistricts[current] = cityDistrict;
        ++current;
    }

    public int getPopulation () {
        return population;
    }
    public String getName () {
        return name;
    }

    public CityDistrict[] getCityDistricts () {
        return cityDistricts;
    }

    public boolean isCapital () {
        return isCapital;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", cityDistricts=" + Arrays.toString(cityDistricts) +
                ", population=" + population +
                ", isCapital=" + isCapital +
                '}';
    }

    public  class CityDistrict {
        private final TypeOfDistrict typeOfDistrict;
        private final String name;

        public CityDistrict ( String typeOfDistrict, String name) {
            this.typeOfDistrict = TypeOfDistrict.valueOf(typeOfDistrict.toUpperCase());
            this.name = name;
        }

        @Override
        public String toString() {
            return "CityDistrict{" +
                    "typeOfDistrict=" + typeOfDistrict.getTranslation() +
                    ", name='" + name + '\'' +
                    '}' + '\n';
        }
    }
}
