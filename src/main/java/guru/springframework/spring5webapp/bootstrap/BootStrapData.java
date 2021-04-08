
package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.repositories.AuthorRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 12/23/19.
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;

    public BootStrapData(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started Bootstrap");

        Author eric = new Author("Eric", "Evans");
        authorRepository.save(eric);

        Author djonco = new Author("djoncoe", "Daboe");
        authorRepository.save(djonco);
        System.out.println( "Saved" +authorRepository.count());
    }
}