package avlyakulov.timur.epam.chapter_6.city.entity;

/*
Город. Возможности: вывести основную информацию о городе (страна,
год основания, популяция, площадь, расположение, бюджет, действую-
щий мэр, язык общения); выбрать нового мэра города; увеличить/умень-
шить популяцию населения; редактировать бюджет; изменить статус го-
рода (закрытие на карантин при определенном проценте зараженных);
ввести\изменить закон. Добавить специализированные методы для Города,
Деревни, Хутора.
 */
public class City {
    String name;
    String country;
    int yearOfCreation;
    protected int population;
    int square;
    protected int budget;
    String language;
    protected String mayor;

    public City(String name, String country, int yearOfCreation, int population, int square, int budget, String language, String mayor) {
        this.name = name;
        this.country = country;
        this.yearOfCreation = yearOfCreation;
        this.population = population;
        this.square = square;
        this.budget = budget;
        this.language = language;
        this.mayor = mayor;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", population=" + population +
                ", square=" + square +
                ", budget=" + budget +
                ", language='" + language + '\'' +
                ", mayor='" + mayor + '\'' +
                '}';
    }
}
