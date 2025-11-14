import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarroTest {

    @Test
    public void testAcelerar() {
        Carro c = new Carro();
        c.velocidade = 0;
        c.potencia = 30;
        c.velocidademaxima = 150;

        c.acelerar();
        c.acelerar();
        c.acelerar();
        c.acelerar();
        c.acelerar();
        c.acelerar();
        
        assertEquals(150, c.getVelocidade());
    }

    @Test
    public void testFrear() {
        Carro c1 = new Carro();
        c1.velocidade = 2;
        c1.potencia = 3;
        
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        assertEquals(0, c1.getVelocidade());
    }

    @Test
    public void testGetVelocidade() {

    }

    @Test
    public void testImprimir() {

    }

}
