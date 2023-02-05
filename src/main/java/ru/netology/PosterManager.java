package ru.netology;

public class PosterManager {
    protected String[] posters = new String[0];
    protected int limit;

    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addPoster(String poster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public String[] findAll() {
        return posters == null ? null : posters.clone();
    }

    public String[] findLast() {
        int postersLength;
        if (limit < posters.length) {
            postersLength = limit;
        } else {
            postersLength = posters.length;
        }
        String[] tmp = new String[postersLength];
        for (int i = 0; i < postersLength; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        return tmp;
    }

}
