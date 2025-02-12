package guilherme.zorato.apilibrary.repository;

import guilherme.zorato.apilibrary.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query(value= "SELECT DISTINCT book_genre FROM book", nativeQuery = true)
    List<String> findAllGenres();
}
