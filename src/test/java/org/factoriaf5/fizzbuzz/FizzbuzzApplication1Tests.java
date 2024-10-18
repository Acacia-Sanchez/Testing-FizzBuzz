package org.factoriaf5.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FizzbuzzApplication1Tests { // Renombrado para evitar conflictos

    @Test
    public void testDivisiblePor3y5() {
        FizzbuzzApplication1 fizzbuzzapp = new FizzbuzzApplication1();
        int numero = 60;
        String result = fizzbuzzapp.divisiblePor3(numero);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void testDivisiblePor3() {
        FizzbuzzApplication1 fizzbuzzapp = new FizzbuzzApplication1();
        int numero = 306;
        String result = fizzbuzzapp.divisiblePor3(numero);
        assertEquals("Fizz", result);
    }

    @Test
    public void testDivisiblePor5() {
        FizzbuzzApplication1 fizzbuzzapp = new FizzbuzzApplication1();
        int numero = 70;
        String result = fizzbuzzapp.divisiblePor3(numero);
        assertEquals("Buzz", result);
    }

    @Test
    public void testNoDivisiblePor3Ni5NiContiene3Ni5() {
        FizzbuzzApplication1 fizzbuzzapp = new FizzbuzzApplication1();
        int numero = 7;
        String result = fizzbuzzapp.divisiblePor3(numero);
        assertEquals("7", result);
    }

    @Test
    public void testDivisibleX3() {
        FizzbuzzApplication1 fizzbuzzap = new FizzbuzzApplication1();
        int numero = 99;

        String result = fizzbuzzap.divisibleOContiene(numero);

        assertEquals("Fizz", result);
    }

    @Test
    public void testContiene3() {
        FizzbuzzApplication1 fizzbuzzap = new FizzbuzzApplication1();
        int numero = 329;

        String result = fizzbuzzap.divisibleOContiene(numero);

        assertEquals("Fizz", result);
    }

    @Test
    public void testDivisibleX5() {
        FizzbuzzApplication1 fizzbuzzap = new FizzbuzzApplication1();
        int numero = 20;

        String result = fizzbuzzap.divisibleOContiene(numero);

        assertEquals("Buzz", result);
    }

    @Test
    public void testContiene5() {
        FizzbuzzApplication1 fizzbuzzap = new FizzbuzzApplication1();
        int numero = 575;

        String result = fizzbuzzap.divisibleOContiene(numero);

        assertEquals("Buzz", result);
    }

    @Test
    public void testNiDivisibleNiContieneNi3Ni5() {
        FizzbuzzApplication1 fizzbuzzap = new FizzbuzzApplication1();
        int numero = 124;

        String result = fizzbuzzap.divisibleOContiene(numero);

        assertEquals("El número " + numero + " no cumple ninguna de las anteriores condiciones", result);
    }

    @Test
    public void testNoDivisiblePor5PeroContiene5() {
        FizzbuzzApplication1 fizzbuzzapp = new FizzbuzzApplication1();
        int numero = 52;
        String result = fizzbuzzapp.divisibleOContiene(numero);
        assertEquals("Buzz", result);
    }
        
}
