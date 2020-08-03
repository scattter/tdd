import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void should_insert_mommy_to_str(){
        // given ""
        String input_str = "";
        // when
        String result = new Mommifier().convert(input_str);
        // then
        assertEquals(input_str,result);
    }
}
