import org.example.Solution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution;
    String[] values;

    @BeforeEach
    void setUp(){
        solution = new Solution();
        values = new String[] {"borboleta", "calice", "zebra"};
    }

    @Test
    void testeBase(){
        String[] expected = Arrays.copyOf(values, values.length);
        Arrays.sort(expected);
        solution.ordenaStrings(values);

        assertArrayEquals(expected, values);
    }

    @Test
    void testeElementosRepetidos(){
        String[] elementosRepetidos = new String[] {"casa", "chamine", "armario","armario", "casa", "armario"};
        String[] expected = new String[] {"armario", "armario", "armario", "casa","casa", "chamine"};

        solution.ordenaStrings(elementosRepetidos);

        assertArrayEquals(expected, elementosRepetidos);
    }
    @Test
    void testeArrayDoisElementos(){
        String[] doisElementos = new String[] {"dedo", "cama"};
        String[] expected = Arrays.copyOf(doisElementos, doisElementos.length);

        Arrays.sort(expected);
        solution.ordenaStrings(doisElementos);

        assertArrayEquals(expected, doisElementos);
    }

    @Test
    void testeArrayNulo(){
        String[] arrayNull = null;
        solution.ordenaStrings(arrayNull);
        assertNull(arrayNull);
    }

}
