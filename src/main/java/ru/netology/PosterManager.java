package ru.netology;

import ru.netology.Repository.RepositoryPoster;
import ru.netology.template.TemplatePoster;

public class PosterManager {
    private RepositoryPoster repo;

    public PosterManager(RepositoryPoster repo) {
        this.repo = repo;
    }

    public void save(TemplatePoster poster) {
        repo.save(poster);
    }

    public void removeById(int id) {
        repo.removeById(id);
    }

    public TemplatePoster[] findAll() {
        TemplatePoster[] posters = repo.findAll();
        return posters;
    }

    public TemplatePoster[] findLast() {
        TemplatePoster[] posters = repo.findLast();
        return posters;
    }

    public TemplatePoster[] findById(int id) {
        TemplatePoster[] posters = repo.findById(id);
        return posters;
    }

    public void removeAll() {
        repo.removeAll();
    }
}
