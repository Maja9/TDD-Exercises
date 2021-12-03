package module3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameInventerTest {

    private  NameInventer nameInventer;

    @BeforeEach
    void setUp() {
        nameInventer = new NameInventer();
    }

    @Test
    void shouldThrowExceptionWhenNullProvided() {
        Assertions.assertThrows(NullPointerException.class, () ->{
            nameInventer.invert(null);
        });
    }

    @Test
    void shouldReturnEmptyStringWhenEmptyStringGiven() {
        String inverted = nameInventer.invert("");
        assertThat(inverted).isEqualTo("");
    }
}
