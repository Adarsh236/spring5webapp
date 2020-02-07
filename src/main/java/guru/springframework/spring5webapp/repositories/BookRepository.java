package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.Model.Book;
import org.springframework.data.repository.CrudRepository;
//import spring.MyFirstSpring.Model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
