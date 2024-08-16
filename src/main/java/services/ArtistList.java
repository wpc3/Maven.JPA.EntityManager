package services;

import entities.Artist;

import java.util.List;

public interface ArtistList {

    <T> List<T> findAll();
}
