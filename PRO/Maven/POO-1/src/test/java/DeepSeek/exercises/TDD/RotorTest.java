package DeepSeek.exercises.TDD;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotorTest {

    @Nested
    class RotorConstructor{
        @Test
        void testEmptyConstructor(){
            Rotor r1 = new Rotor();
        }

        @Test
        void testConstuctorWithConfig(){
            String[][] config = {{"A", "B", "C", "D"},{"E", "F", "G", "H"}};
            Rotor r1 = new Rotor(config);
        }

        @Test
        void testConstructorsConfig(){
            String[][] config = {{"A", "B", "C", "D"},{"E", "F", "G", "H"}};
            Rotor r1 = new Rotor(config);
            String expectedLetter = "A";
            assertEquals(expectedLetter, config[0][0]);
        }
    }
}