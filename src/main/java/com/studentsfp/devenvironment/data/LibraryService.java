package com.studentsfp.devenvironment.data;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//service:
@Service
public class LibraryService {
    //hemos de tener una lista de todas las publicaciones que tengamos
    private static final List<Publication> publicationList= new ArrayList<>();
    //hemos de poder acceder a List<Publication>
    public static List<Publication> getPublicationList() {
        return publicationList;
    }

    public void setPublicationList(List<Publication> publicationList) {
        setPublicationList(publicationList);
    }
}
