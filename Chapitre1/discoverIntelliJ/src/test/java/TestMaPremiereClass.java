import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
// ou


public class TestMaPremiereClass {
    @Test
    public void testAdd () {
        //Arrange
        int a = 4;
        int b = 10;
        MaPremiereClass maPremiereClass = new MaPremiereClass();

        //Act
        int result = maPremiereClass.add(a, b);

        //Assert
        assertEquals((a+b), result);
        assertNotEquals((a-b), result);
    }

}
