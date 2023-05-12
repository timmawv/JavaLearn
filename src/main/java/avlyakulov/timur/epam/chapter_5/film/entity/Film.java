package avlyakulov.timur.epam.chapter_5.film.entity;

import java.util.Arrays;

/*
Создать класс Фильм с внутренним классом, с помощью объектов которого
можно хранить информацию о продолжительности, жанре и режиссерах фильма.
 */
public class Film {

    private Genre[] films;
    private int current;

    public Film () {
        films = new Genre[2];
    }

    public void addFilm (Genre film) {
        if (current == films.length) {
            Genre[] films1 = new Genre[films.length + 1];
            System.arraycopy(films,0,films1,0,films.length);
            films = films1;
        }
        films[current] = film;
        ++current;
    }

    @Override
    public String toString() {
        return "Film{" +
                "films =" + Arrays.toString(films) +
                '}';
    }

    public class Genre {
        private String duration;
        private String producer;
        private avlyakulov.timur.epam.chapter_5.film.entity.Genre nameOfGenre;
        private String nameOfFilm;

        public Genre (String duration, String producer, avlyakulov.timur.epam.chapter_5.film.entity.Genre nameOfGenre, String nameOfFilm) {
            this.duration = duration;
            this.producer = producer;
            this.nameOfGenre = nameOfGenre;
            this.nameOfFilm = nameOfFilm;
        }


        @Override
        public String toString() {
            return "Genre of film{" +
                    "duration='" + duration + '\'' +
                    ", producer='" + producer + '\'' +
                    ", nameOfGenre='" + nameOfGenre + '\'' +
                    ", nameOfFilm='" + nameOfFilm + '\'' +
                    '}' + '\n';
        }
    }
}
