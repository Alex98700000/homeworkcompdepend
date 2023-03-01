package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FilmManagerTest {
    @Test
    public void filmAllTestOne() {
        String film1 = "Cinema one";
        String film2 = "Cinema two";
        String film3 = "Cinema three";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager. findAll();
        String[] expected = {film1, film2, film3 };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void filmAllTestTwo() {
        String film1 = "Cinema one";
        String film2 = "Cinema two";
        String film3 = "Cinema three";
        String film4 = "Cinema four";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager. findAll();
        String[] expected = {film1, film2, film3 };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmAllTestThree() {
        String film1 = "Cinema one";
        String film2 = "Cinema two";


        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);



        String[] actual = manager. findAll();
        String[] expected = {film1, film2,};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void filmLastTestOne() {
        String film1 = "Cinema one";
        String film2 = "Cinema two";
        String film3 = "Cinema three";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager. findLast();
        String[] expected = {film3, film2, film1 };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void filmLastTestTwo() {
        String film1 = "Cinema one";
        String film2 = "Cinema two";
        String film3 = "Cinema three";
        String film4 = "Cinema four";

        FilmManager manager = new FilmManager();
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);


        String[] actual = manager. findLast();
        String[] expected = {film4, film3, film2 };
        Assertions.assertArrayEquals(expected, actual);
    }

}
