package com.studentsfp.devenvironment.data;

import java.util.ArrayList;
import java.util.List;

public class LibraryHelper {

    public static Publication initLibrary(String isbn, String title, String year){
        List<Publication> publicationList = new ArrayList<>();
        LibraryService service = new LibraryService();
        Publication publication = new Publication();
        publication.setIsbn(isbn);
        publication.setTitle(title);
        publication.setYear(year);
        publicationList.add(publication); //añado la publicación en publicationList
        service.setPublicationList(publicationList); //si ya he echo un add.publication, ¿es necesario hacer el set?
        return publication;
    }
}

//for (Publication publication: publicationList) //por cada publicación que se encuentra en publicación list
// {
