package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.UnrecoverableEntryException;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    String posterOne = "Бладшот";
    String posterTwo = "Вперед";
    String posterThree = "Отель 'Белград'";
    String posterFour = "Джентельмены";
    String posterFive = "Человек-невидимка";
    String posterSix = "Тролли. Мировой тур";
    String posterSeven = "Номер один";
    String posterEight = "Крушение";
    String posterNine = "Хищники";
    String posterTen = "Изумительный Морис";
    String posterEleven = "Особо опасен";


    @Test
    public void shouldAddEqualPoster() {
        PosterManager manager = new PosterManager();

        manager.addPoster(posterOne);
        manager.addPoster(posterOne);
        manager.addPoster(posterOne);
        manager.addPoster(posterOne);
        manager.addPoster(posterOne);

        String[] expected = {posterOne, posterOne, posterOne, posterOne, posterOne};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddPoster() {
        PosterManager manager = new PosterManager();

        manager.addPoster(posterOne);
        manager.addPoster(posterTwo);
        manager.addPoster(posterThree);
        manager.addPoster(posterFour);
        manager.addPoster(posterFive);

        String[] expected = {posterOne, posterTwo, posterThree, posterFour, posterFive};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAboveLimit() {
        PosterManager manager = new PosterManager();

        manager.addPoster(posterOne);
        manager.addPoster(posterTwo);
        manager.addPoster(posterThree);
        manager.addPoster(posterFour);
        manager.addPoster(posterFive);
        manager.addPoster(posterSix);
        manager.addPoster(posterSeven);
        manager.addPoster(posterEight);
        manager.addPoster(posterNine);
        manager.addPoster(posterTen);
        manager.addPoster(posterEleven);

        String[] expected = {posterEleven, posterTen, posterNine, posterEight, posterSeven, posterSix, posterFive, posterFour, posterThree, posterTwo};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastBelowLimit() {
        PosterManager manager = new PosterManager();

        manager.addPoster(posterOne);
        manager.addPoster(posterTwo);
        manager.addPoster(posterThree);
        manager.addPoster(posterFour);
        manager.addPoster(posterFive);
        manager.addPoster(posterSix);
        manager.addPoster(posterSeven);
        manager.addPoster(posterEight);
        manager.addPoster(posterNine);

        String[] expected = {posterNine, posterEight, posterSeven, posterSix, posterFive, posterFour, posterThree, posterTwo, posterOne};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLimit() {
        PosterManager manager = new PosterManager();

        manager.addPoster(posterOne);
        manager.addPoster(posterTwo);
        manager.addPoster(posterThree);
        manager.addPoster(posterFour);
        manager.addPoster(posterFive);
        manager.addPoster(posterSix);
        manager.addPoster(posterSeven);
        manager.addPoster(posterEight);
        manager.addPoster(posterNine);
        manager.addPoster(posterTen);

        String[] expected = {posterTen, posterNine, posterEight, posterSeven, posterSix, posterFive, posterFour, posterThree, posterTwo, posterOne};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        PosterManager manager = new PosterManager();

        manager.addPoster(posterSeven);
        manager.addPoster(posterEight);
        manager.addPoster(posterNine);
        manager.addPoster(posterTen);
        manager.addPoster(posterEleven);

        String[] expected = {posterEleven, posterTen, posterNine, posterEight, posterSeven};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetNewLimit() {
        PosterManager manager = new PosterManager(11);

        manager.addPoster(posterOne);
        manager.addPoster(posterTwo);
        manager.addPoster(posterThree);
        manager.addPoster(posterFour);
        manager.addPoster(posterFive);
        manager.addPoster(posterSix);
        manager.addPoster(posterSeven);
        manager.addPoster(posterEight);
        manager.addPoster(posterNine);
        manager.addPoster(posterTen);
        manager.addPoster(posterEleven);

        String[] expected = {posterEleven, posterTen, posterNine, posterEight, posterSeven, posterSix, posterFive, posterFour, posterThree, posterTwo, posterOne};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAboveLimit() {
        PosterManager manager = new PosterManager(1);

        manager.addPoster(posterOne);
        manager.addPoster(posterTwo);

        String[] expected = {posterTwo};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindIfBelowLimit() {
        PosterManager manager = new PosterManager(3);

        manager.addPoster(posterOne);
        manager.addPoster(posterTwo);

        String[] expected = {posterTwo, posterOne};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfEqualPoster() {
        PosterManager manager = new PosterManager(5);

        manager.addPoster(posterOne);
        manager.addPoster(posterOne);
        manager.addPoster(posterOne);
        manager.addPoster(posterOne);
        manager.addPoster(posterOne);

        String[] expected = {posterOne, posterOne, posterOne, posterOne, posterOne};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}