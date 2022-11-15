package avlyakulov.timur.epam.chapter_5.film.controller;

import avlyakulov.timur.epam.chapter_5.film.entity.Film;
import avlyakulov.timur.epam.chapter_5.film.entity.Genre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FilmController {
    Film film;

    public boolean isFilmCreated() {
        if (film == null) {
            System.out.println("You didn't create any film to add genre");
            return false;
        }
        else return true;
    }

    public void run() {
        String position;
        runNavigation();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                else crud (position,reader);
                runNavigation();
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }

    public void crud (String position, BufferedReader reader) {
        switch (position) {
            case "1" -> {
                if (film != null)
                    System.out.println("You have created film");
                else film = new Film();
            }
            case "2" -> {
                if (isFilmCreated())
                    addFilm(reader);
            }
            case "3" -> {
                if (isFilmCreated())
                    System.out.println(film);
            }
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create film press 1");
        System.out.println("If you want to add film press 2");
        System.out.println("If you want to print all your films press 3");
        System.out.println("If you want to finish program press 0");
        System.out.println();
    }

    public void addFilm (BufferedReader reader) {
        try {
            System.out.println("Enter the name of film ");
            String nameOfFilm = reader.readLine();
            System.out.println("Enter the duration of film");
            String duration = reader.readLine();
            System.out.println("Enter the name of producer");
            String nameOfProducer = reader.readLine();
            System.out.println("Choose genre of film from list ");
            System.out.println(Arrays.toString(Genre.values()));
            String nameOfGenre = reader.readLine();
            Genre genre = Genre.valueOf(nameOfGenre.toUpperCase());
            Film.Genre genreOfFilm = film.new Genre(duration,nameOfProducer,genre,nameOfFilm);
            film.addFilm(genreOfFilm);
        }
        catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }
}
