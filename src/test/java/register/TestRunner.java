package register;

import com.intuit.karate.junit5.Karate;

public class TestRunner {

    @Karate.Test
    public Karate registerTest(){
        return Karate.run().relativeTo(getClass());
    }
}
