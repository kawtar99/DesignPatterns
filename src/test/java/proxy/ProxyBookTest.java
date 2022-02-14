package proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyBookTest {

    @Test
    public void shouldShouldAddSecurityLayer(){
        ProxyBook proxyBook = new ProxyBook("Title", "Author");
        String details = proxyBook.getDetails();

        assertEquals(details, "Security measures ...\n" +
                "Title is written by : Author");
    }

}