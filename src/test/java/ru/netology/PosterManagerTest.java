package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.Repository.RepositoryPoster;
import ru.netology.template.TemplatePoster;

import static org.mockito.Mockito.doReturn;

class PosterManagerTest {
    RepositoryPoster repo = Mockito.mock(RepositoryPoster.class);
    PosterManager manager = new PosterManager(repo);

    TemplatePoster posterOne = new TemplatePoster(1, "Бладшот", "боевик", 25);
    TemplatePoster posterTwo = new TemplatePoster(2, "Вперед", "мультфильм", 21);
    TemplatePoster posterThree = new TemplatePoster(3, "Отель 'белград'", "комедия", 15);
    TemplatePoster posterFour = new TemplatePoster(4, "Джентельмены", "боевик", 22);
    TemplatePoster posterFive = new TemplatePoster(5, "Человек-невидимка", "ужасы", 24);
    TemplatePoster posterSix = new TemplatePoster(6, "Тролли. Мировой тур", "мульфильм", 21);
    TemplatePoster posterSeven = new TemplatePoster(7, "Номер один", "комедия", 23);
    TemplatePoster posterEight = new TemplatePoster(8, "Крушение", "боевик", 20);
    TemplatePoster posterNine = new TemplatePoster(9, "Хищники", "триллер", 20);
    TemplatePoster posterTen = new TemplatePoster(10, "Изумительный Морис", "комедия", 28);
    TemplatePoster posterEleven = new TemplatePoster(1, "Особо опасен", "боевик", 28);

    @Test
    public void shouldAddEqualPoster() {
        TemplatePoster[] posters = {posterOne, posterOne};
        doReturn(posters).when(repo).findAll();

        TemplatePoster[] expected = {posterOne, posterOne};
        TemplatePoster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindByIdPoster() {
        TemplatePoster[] posters = {posterFive};
        doReturn(posters).when(repo).findById(5);

        TemplatePoster[] expected = {posterFive};
        TemplatePoster[] actual = manager.findById(5);

        Assertions.assertArrayEquals(expected, actual);
    }

}