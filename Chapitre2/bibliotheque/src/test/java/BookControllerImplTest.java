import com.picard.bibliotheque.controller.BookControllerImpl;
import com.picard.bibliotheque.model.Book;
import com.picard.bibliotheque.repository.BookRepositoryImpl;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.Date;

import static com.mongodb.assertions.Assertions.fail;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Group of units tests for the book controller")
public class BookControllerImplTest {

    @Mock
    BookRepositoryImpl bookRepository;
    Book christineBook = new Book(
            "Christine",
            "Stephen King",
            new Date(1982, 1, 1),
            529);
    Book brokenBook = new Book(
            "Christine",
            "Stephen King",
            new Date(2082, 1, 1),
            -529);
    String id = "idChristine";

    BookControllerImpl classUnderTest;

    @BeforeEach
    public void setUp () {

        classUnderTest = new BookControllerImpl(bookRepository);
    }

    @Disabled
    @Test
    @DisplayName("Test an action")
    public void voidAction_isTested_shouldFail () {

        fail("Not yet implemented");
    }

    @Test
    @DisplayName("Test if the save method of the repository is called with a Book")
    public void save_withBook_shouldCallRepository () {
        //Arrange
        when(bookRepository.save(christineBook)).thenReturn(id);

        //Act
        String result = classUnderTest.saveBook(christineBook);

        //Assert
        verify(bookRepository).save(christineBook);
        verify(bookRepository).save(any(Book.class));
        verify(bookRepository, times(1))
                .save(any(Book.class));
        verify(bookRepository, never()).getAll();
        assertThat(result).isEqualTo(id);
    }
}
