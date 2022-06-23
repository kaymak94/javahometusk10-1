package ru.netology.domain;

import ru.netology.manager.FilmsManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmsManagerTest {
    FilmsList one = new FilmsList("Kill Bill");
    FilmsList two = new FilmsList("1+1");
    FilmsList three = new FilmsList("Titanic");
    FilmsList four = new FilmsList("Avatar");
    FilmsList five = new FilmsList("Godfather");
    FilmsList six = new FilmsList("K-pax");
    FilmsList seven = new FilmsList("Calvary");
    FilmsList eight = new FilmsList("Mortal Kombat");
    FilmsList nine = new FilmsList("Professor");
    FilmsList ten = new FilmsList("Her");
    FilmsList eleven = new FilmsList("Penelope");

    @Test
    public void showLastNeedFilmsTest() {
        FilmsManager manager = new FilmsManager(5);
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        FilmsList[] expected = {eleven, ten, nine, eight, seven};
        FilmsList[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showDefaultAddFilmsTest() {
        FilmsManager manager = new FilmsManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        FilmsList[] expected = {eleven, ten, nine, eight, seven, six, five, four, three, two};
        FilmsList[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void showFindAllFilmsTest() {
        FilmsManager manager = new FilmsManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);

        FilmsList[] expected = {one, two, three, four};
        FilmsList[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showNullAddFilmsTest() {
        FilmsManager manager = new FilmsManager();


        FilmsList[] expected = {};
        FilmsList[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}