package Spoj;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddRevTest {

    @Test
    public void testReversNumberHappyPath() throws Exception {
        final String entrada = "123";
        final Integer saida_esperada = 321;
        final Integer saidaAtual = AddRev.RevNumero(entrada);
        assertEquals(saida_esperada, saidaAtual);
    }

    @Test
    public void testReversNumberWithZeros() throws Exception {
        final String entrada = "123000";
        final Integer saida_esperada = 321;
        final Integer saidaAtual = AddRev.RevNumero(entrada);
        assertEquals(saida_esperada, saidaAtual);
    }

    @Test
    public void testReversNumberWithZeroInside() throws Exception {
        final String entrada = "503";
        final Integer saidaEsperada = 305;
        final Integer saidaAtual = AddRev.RevNumero(entrada);
        assertEquals(saidaEsperada, saidaAtual);
    }

    @Test
    public void testReversNumberOneDigit() throws Exception {
        final String entrada = "1";
        final Integer saidaEsperada = 1;
        final Integer saidaAtual = AddRev.RevNumero(entrada);
        assertEquals(saidaEsperada, saidaAtual);
    }

   
   

}