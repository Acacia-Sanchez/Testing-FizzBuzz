package org.factoriaf5.fizzbuzz;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzbuzzApplication1 {

    // metodo etapa 1
    public String divisiblePor3(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) { // el símbolo % chequea que no deja residuos
            return "FizzBuzz";
        } else if (numero % 3 == 0) {
            return "Fizz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(numero); // convierte a cadena de texto el resultdo de cualquier variable
        }

    }

    // metodo etapa 2
    public String divisibleOContiene(int numero) {
        boolean hayun3 = false;
        boolean hayun5 = false;
        String numcadena = String.valueOf(numero);
        if (numcadena.contains("3")) {
            hayun3 = true;
        }
        if (numcadena.contains("5")) {
            hayun5 = true;
        }

        if (numero % 3 == 0 || hayun3) { // el símbolo % chequea que no deja residuos
            return "Fizz";
        } else if (numero % 5 == 0 || hayun5) {
            return "Buzz";
        } else {
            return ("El número " + numero + " no cumple ninguna de las anteriores condiciones");
        }

    }
}
