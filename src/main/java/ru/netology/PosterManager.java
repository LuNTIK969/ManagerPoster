package ru.netology;

import ru.netology.Repository.RepositoryPoster;
import ru.netology.template.TemplatePoster;

public class PosterManager {
    private RepositoryPoster repo;

    protected PosterManager(RepositoryPoster repo) {
        this.repo = repo;
    }

    public void save(TemplatePoster poster) {
        repo.save(poster);
    }

    public TemplatePoster[] removeById(int id) {
        TemplatePoster[] posters = repo.removeById(id);
        return posters;
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

    public TemplatePoster[] removeAll() {
        TemplatePoster[] posters = repo.removeAll();
        return posters;
    }
}
