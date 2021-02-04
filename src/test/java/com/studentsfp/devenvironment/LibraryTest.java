package com.studentsfp.devenvironment;

import com.studentsfp.devenvironment.data.Publication;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.logging.Logger;

@SpringBootTest
public class LibraryTest {

    private final Logger log = (Logger) LoggerFactory.getLogger(this.getClass());
    @Test
    public void addPublication()
    {
        String title="El Quijote";
        String isbn="12345567";
        String year="1999";
        Publication publication=new Publication(isbn,title,year);
        Assert.isTrue(StringUtils.equals(title,publication.getTitle()),"No són iguales.");
        log.info("test successful");
    }
    @Test
    public void showLibrary()
    {
        /*LibraryService service = new LibraryService();
        List<Publication> publicationList = ("El Quijote","1234567","1999");
        Assert.isTrue(publicationList.equals(service.getPublicationList("ddd","ss","sss"),"No són iguales.");*/
    }


}
