import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class exercicio1Test {
    exercicio1 codigoEmTeste;

    @BeforeEach
    void setUp() {
        codigoEmTeste = new exercicio1();
    }

    /**
     * Testes método calculaMedia
     */
    @Test
    void calculaMediaZerada() {
        List<Integer> lista = Arrays.asList(0, 0, 0, 0);

        double realizado = codigoEmTeste.calculaMedia(lista);
        assertEquals(0.0, realizado);
    }

    @Test
    void calculaMediaVazia() {
        List<Integer> lista = Arrays.asList();

        double realizado = codigoEmTeste.calculaMedia(lista);
        assertEquals(0.0, realizado);
    }

    @Test
    void calculaMediaNegativos() {
        List<Integer> lista = Arrays.asList(-1, -17, -42, -13);

        double realizado = codigoEmTeste.calculaMedia(lista);
        assertEquals(-18.25, realizado);
    }

    @Test
    void calculaMediaAleatorios() {
        List<Integer> lista = Arrays.asList(-10, 20, -13781, 13);

        double realizado = codigoEmTeste.calculaMedia(lista);
        assertEquals(-3439.5, realizado);
    }

    /**
     * Testes método estaOrdenada
     */
    @Test
    void estaOrdenadaCrescente() {
        List<Integer> lista = Arrays.asList(3, 5, 17, 20, 42, 56);

        boolean realizado = codigoEmTeste.estaOrdenada(lista);
        assertTrue(realizado);
    }

    @Test
    void estaOrdenadaDecrescente() {
        List<Integer> lista = Arrays.asList(56, 42, 20, 17, 5, 3);

        boolean realizado = codigoEmTeste.estaOrdenada(lista);
        assertFalse(realizado);
    }

    @Test
    void estaQuaseOrdenada() {
        List<Integer> lista = Arrays.asList(3, 5, 17, 20, 42, 13);

        boolean realizado = codigoEmTeste.estaOrdenada(lista);
        assertFalse(realizado);
    }

    @Test
    void estaDesordenada() {
        List<Integer> lista = Arrays.asList(20, 3, 5, 17, 42, 56);

        boolean realizado = codigoEmTeste.estaOrdenada(lista);
        assertFalse(realizado);
    }

    /**
     * Testes método fatorial
     */
    @Test
    void fatorialZero() {
        int realizado = codigoEmTeste.fatorial(0);

        assertEquals(1, realizado);
    }

    @Test
    void fatorialPositivo() {
        int realizado = codigoEmTeste.fatorial(5);

        assertEquals(120, realizado);
    }

    @Test
    void fatorialNegativo() {
        int realizado = codigoEmTeste.fatorial(-5);

        assertEquals(1, realizado);
    }

    @Test
    void fatorialUm() {
        int realizado = codigoEmTeste.fatorial(1);

        assertEquals(1, realizado);
    }

    /**
     * Testes método converteTemperatura
     */
    @Test
    void converteTemperaturaZeroAbsoluto() {
        double realizado = codigoEmTeste.converteTemperatura(-273.15);

        assertEquals(-459.67, realizado, 0.1);
    }

    @Test
    void converteTemperaturaNegativo() {
        double realizado = codigoEmTeste.converteTemperatura(-7.00);

        assertEquals(19.4, realizado, 0.1);
    }

    @Test
    void converteTemperaturaPositivo() {
        double realizado = codigoEmTeste.converteTemperatura(42.00);

        assertEquals(107.6, realizado, 0.1);
    }

    @Test
    void converteTemperaturaPositivoDecimal() {
        double realizado = codigoEmTeste.converteTemperatura(13.1313);

        assertEquals(55.63634, realizado, 0.1);
    }

    /**
     * Testes método ePrimo
     */
    @Test
    void ePrimoSim() {
        boolean realizado = codigoEmTeste.ePrimo(17);

        assertTrue(realizado);
    }

    @Test
    void ePrimoNegativo() {
        boolean realizado = codigoEmTeste.ePrimo(-1);

        assertFalse(realizado);
    }

    @Test
    void ePrimoUm() {
        boolean realizado = codigoEmTeste.ePrimo(1);

        assertFalse(realizado);
    }
    @Test
    void ePrimoNao() {
        boolean realizado = codigoEmTeste.ePrimo(26);

        assertFalse(realizado);
    }

    /**
     * Testes método listaOrdenada
     */
    @Test
    void listaOrdenadaCrescente() {
        List<Integer> lista = Arrays.asList(3, 5, 17, 20, 42, 56);

        boolean realizado = codigoEmTeste.listaOrdenada(lista);
        assertTrue(realizado);
    }

    @Test
    void listaOrdenadaDecrescente() {
        List<Integer> lista = Arrays.asList(56, 42, 20, 17, 5, 3);

        boolean realizado = codigoEmTeste.listaOrdenada(lista);
        assertTrue(realizado);
    }

    @Test
    void listaQuaseOrdenada() {
        List<Integer> lista = Arrays.asList(3, 5, 17, 20, 42, 13);

        boolean realizado = codigoEmTeste.listaOrdenada(lista);
        assertFalse(realizado);
    }

    @Test
    void listaDesordenada() {
        List<Integer> lista = Arrays.asList(20, 3, 5, 17, 42, 56);

        boolean realizado = codigoEmTeste.estaOrdenada(lista);
        assertFalse(realizado);
    }

}