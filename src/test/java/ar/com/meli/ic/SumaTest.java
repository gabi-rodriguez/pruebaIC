package ar.com.meli.ic;

import ar.com.meli.ic.operaciones.Suma;
import org.junit.Assert;
import org.junit.Test;


public class SumaTest {

    @Test
    public void testearSuma(){
        Suma s = new Suma(2,3);
        Integer esperado = 5;
        Integer real = s.sumar();
        Assert.assertTrue(real == esperado);
    }


}
