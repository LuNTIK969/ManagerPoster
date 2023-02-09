package ru.netology.Repository;

import ru.netology.template.TemplatePoster;

import java.util.Arrays;

public class RepositoryPoster {
    protected int limit;
    protected TemplatePoster[] posters = new TemplatePoster[0];

    public RepositoryPoster() {
        this.limit = 10;
    }

    public RepositoryPoster(int limit) {
        this.limit = limit;
    }

    public TemplatePoster[] save(TemplatePoster poster) {
        TemplatePoster[] tmp = new TemplatePoster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
        return posters.clone();
    }

    public TemplatePoster[] removeById(int id) {
        TemplatePoster[] tmp = new TemplatePoster[posters.length - 1];
        int temporaryCopy = 0;
        for (TemplatePoster poster : posters) {
            if (poster.getId() != id) {
                tmp[temporaryCopy] = poster;
                temporaryCopy++;
            }
            posters = tmp;
        }
        return posters.clone();
    }

    public TemplatePoster[] findAll() {
        return posters.clone();
    }

    public TemplatePoster[] findById(int id) {
        for (TemplatePoster poster : posters) {
            if (poster.getId() == id) {
                return posters.clone();
            }
        }
        return null;
    }


    public TemplatePoster[] removeAll() {
        TemplatePoster[] tmp = new TemplatePoster[posters.length];
        Arrays.fill(tmp, 0);
        posters = tmp;
        return posters.clone();
    }

    public TemplatePoster[] findLast() {
        TemplatePoster[] posters = new TemplatePoster[0];
        int postersLength;
        if (limit < posters.length) {
            postersLength = limit;
        } else {
            postersLength = posters.length;
        }
        TemplatePoster[] tmp = new TemplatePoster[postersLength];
        for (int i = 0; i < postersLength; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        return tmp;
    }
}
