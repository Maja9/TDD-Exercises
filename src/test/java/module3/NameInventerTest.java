package module3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameInventerTest {
    @Test
    void shouldThrowExceptionWhenNullProvided() {
        NameInventer nameInventer = new NameInventer();
        Assertions.assertThrows(NullPointerException.class, () ->{
            nameInventer.invert(null);
        });

    }
}
