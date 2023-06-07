import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaPremiereClass {
    private static Logger logger = LoggerFactory.getLogger(MaPremiereClass.class);
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            logger.info("Hello World");
        }
    }
    public int add(int a, int b) {
        return a+b;
    }
}
