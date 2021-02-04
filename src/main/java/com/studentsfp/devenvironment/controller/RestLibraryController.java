package com.studentsfp.devenvironment.controller;

import com.studentsfp.devenvironment.data.LibraryHelper;
import com.studentsfp.devenvironment.data.LibraryService;
import com.studentsfp.devenvironment.data.Publication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RestLibraryController {
    LibraryService service = new LibraryService();

    @GetMapping("/getPublication")
    public List<Publication>  getPublication(){
        return service.getPublicationList(); }

    @GetMapping("/getPublications")
    public Publication getPublications(@RequestParam(value = "title", defaultValue = "El Quijote") String title,
                                      @RequestParam(value = "isbn", defaultValue = "99999999") String isbn,
                                      @RequestParam(value = "year", defaultValue = "1898") String year) {

            Publication publication = LibraryHelper.initLibrary(title,isbn,year);
            return publication;
    }


}
