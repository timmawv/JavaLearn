package avlyakulov.timur.epam.chapter_5.city.entity;

public enum TypeOfDistrict {
    AVENUE("проспект"),STREET("улица"),SQUARE("площадь");
    private final String translation;
    TypeOfDistrict(String translation) {
         this.translation = translation;
    }

    public String getTranslation () {
        return translation;
    }

    @Override
    public String toString() {
        return "TypeOfDistrict{" +
                "translation='" + translation + '\'' +
                "} " + super.toString();
    }
}
