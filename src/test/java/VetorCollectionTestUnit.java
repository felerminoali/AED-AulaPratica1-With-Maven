/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mz.com.osoma.aed.aulapratica.Vetor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author feler
 */
public class VetorCollectionTestUnit {
    
    public VetorCollectionTestUnit() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testeAdiciona() {

        Vetor lista = new Vetor();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4);
        lista.adiciona(5);

        String experado = "[1, 2, 4, 5]";

        Assert.assertEquals(experado, lista.toString());
    }

    @Test
    public void testeAdicionaNaPosicao() {

        Vetor lista = new Vetor();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4);
        lista.adiciona(5);

        lista.adiciona(2, 7);

        String experado = "[1, 2, 7, 4, 5]";

        Assert.assertEquals(experado, lista.toString());

    }

    @Test
    public void testBubbleSort() {

        Vetor lista = new Vetor();

        lista.adiciona(4);
        lista.adiciona(3);
        lista.adiciona(2);
        lista.adiciona(1);

        lista.bubbleSort();

        String experado = "[1, 2, 3, 4]";

        Assert.assertEquals(experado, lista.toString());
    }

    @Test
    public void testSelectioSort() {

        Vetor lista = new Vetor();

        lista.adiciona(4);
        lista.adiciona(3);
        lista.adiciona(2);
        lista.adiciona(1);

        lista.selectionSort();

        String experado = "[1, 2, 3, 4]";

        Assert.assertEquals(experado, lista.toString());
    }

    @Test
    public void testInsertionSort() {

        Vetor lista = new Vetor();

        lista.adiciona(4);
        lista.adiciona(3);
        lista.adiciona(2);
        lista.adiciona(1);

        lista.insertionSort();

        String experado = "[1, 2, 3, 4]";

        Assert.assertEquals(experado, lista.toString());
    }

    
    @Test
    public void testQuickSort() {

        Vetor lista = new Vetor();

        lista.adiciona(4);
        lista.adiciona(3);
        lista.adiciona(2);
        lista.adiciona(1);

        lista.quickSort();

        String experado = "[1, 2, 3, 4]";

        Assert.assertEquals(experado, lista.toString());
    }
    
    
    @Test
    public void testBuscaLinear() {

        Vetor lista = new Vetor();

        lista.adiciona(4);
        lista.adiciona(3);
        lista.adiciona(2);
        lista.adiciona(1);

        Assert.assertEquals(true, lista.linearSearch(2));
        
    }

    
    @Test
    public void testBuscaBinaria() {

        Vetor lista = new Vetor();

        lista.adiciona(4);
        lista.adiciona(3);
        lista.adiciona(2);
        lista.adiciona(1);
        
        lista.bubbleSort();
        Assert.assertEquals(true, lista.binarySearch(3));
        
    }
}
