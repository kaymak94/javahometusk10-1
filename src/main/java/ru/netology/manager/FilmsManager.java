package ru.netology.manager;

import ru.netology.domain.FilmsList;


public class FilmsManager {

    private int defaultFilmsLimit = 10;
    private FilmsList[] films = new FilmsList[0];

    public FilmsManager() {

    }

    public FilmsManager(int defaultFilmsLimit) {

        this.defaultFilmsLimit = defaultFilmsLimit;
    }


    public void add(FilmsList film) {

        int length = films.length + 1;
        FilmsList[] tmp = new FilmsList[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }


    public FilmsList[] findAll() {
        return films;
    }

    public FilmsList[] findLast() {
        int resultLength = 0;
        if (films.length > defaultFilmsLimit) {
            resultLength = defaultFilmsLimit;
        }
        if (films.length <= defaultFilmsLimit) {
            resultLength = films.length;
        }

        FilmsList[] need = new FilmsList[resultLength];
        for (int i = 0; i < need.length; i++) {
            int index = films.length - i - 1;
            need[i] = films[index];

        }

        return need;
    }


}


