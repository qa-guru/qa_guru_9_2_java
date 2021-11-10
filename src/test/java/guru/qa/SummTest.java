package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SummTest {

    HelloWorld hw = new HelloWorld();
    
    @Test
    void summTest() {
        int summ = hw.summ(2, 4);
        Assertions.assertEquals(6, summ);
        say((Integer) null);
        say((Object) null);
    }

    void say(Integer st) {
        System.out.println(st);
    }

    void say(Object st) {
        System.out.println(st);
    }
}
