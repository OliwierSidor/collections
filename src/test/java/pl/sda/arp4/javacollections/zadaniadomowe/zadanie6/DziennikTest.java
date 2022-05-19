package pl.sda.arp4.javacollections.zadaniadomowe.zadanie6;

import junit.framework.TestCase;
import org.junit.Test;

public class DziennikTest extends TestCase {

    @Test
    public void test_zwrocStudenta() {
        Dziennik dziennik = new Dziennik();
        Student s;
        try {
            s = dziennik.zwrocStudenta("123");
        } catch (BrakStudentaExepction e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void test_zwrocStudetaNull(){
        Dziennik dziennik = new Dziennik();
Student s = dziennik.zwrocStudentaNull("123");
        System.out.println(s.getNumerIndeksu());
    }
}