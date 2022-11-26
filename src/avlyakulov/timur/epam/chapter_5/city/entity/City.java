package avlyakulov.timur.epam.chapter_5.city.entity;
/*
Создать класс City с внутренним классом, с помощью объектов которого
можно хранить информацию о проспектах, улицах, площадях.
 */
public class City {
    private CityDistrict[] cityDistricts;

    public class CityDistrict {
        private String name;
        private TypeOfDistrict typeOfDistrict;

    }
}
