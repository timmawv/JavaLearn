package avlyakulov.timur.epam.chapter_6.city.impl;

import avlyakulov.timur.epam.chapter_6.city.entity.City;
import avlyakulov.timur.epam.chapter_6.city.entity.CityAction;

public class CityActionImpl extends City implements CityAction {

    public CityActionImpl(String name, String country, int yearOfCreation, int population, int square, int budget, String language, String mayor) {
        super(name,country, yearOfCreation, population, square,budget ,language,mayor );
    }
    @Override
    public void chooseNewMayor(String mayor) {
        this.mayor = mayor;
    }

    @Override
    public void changeNumberOfPopulation(int population, boolean checkNum) {
        if (checkNum) {
            if (this.population > population)
                System.out.println("You enter the value less than your population");
            else {
                this.population = population;
            }
        }
        else {
            if (this.population < population)
                System.out.println("You enter the value more than your population");
            else {
                this.population = population;
            }
        }
    }

    @Override
    public void editBudgetOfCity(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "City{} " + super.toString();
    }
}
