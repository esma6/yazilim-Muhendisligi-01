/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package homework3;

import org.junit.jupiter.api.Test;

import homework.App;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test public void testFound()
    { //girilen eleman arrayde mevcut. Bu fonksiyondan true donmeli
       ArrayList<Integer> array=new ArrayList<>(Arrays.asList(1,2,3,4));
       assertTrue(App.search(array,4)); //dizinin icinde olan elemanla dene
    }

    @Test public void testNotFound()
    { //girilen eleman arrayde mevcut degil. Bu fonksiyondan false donmeli
       ArrayList<Integer> array=new ArrayList<>(Arrays.asList(1,2,3,4));
       assertFalse(App.search(array,5)); //dizinin icinde olmayan elemanla dene
    }

    @Test public void testEmptyArray()
    { //array bos olusturulmus. Bu fonksiyondan aranan her elemandan false donmeli
       ArrayList<Integer> array=new ArrayList<>();
       assertFalse(App.search(array,1)); //bos oldugu icin herhangi bi degeri arat
    }

    @Test public void testNull()
    { //array hic olusturulmamis. Bu fonksiyondan false donmeli
      //ArrayList<Integer> array=new ArrayList<>();
       assertFalse(App.search(null,1)); //array yok null herhangi bi deger
    }


}
