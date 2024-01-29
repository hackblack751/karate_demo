package animal;

import com.intuit.karate.junit5.Karate;

public class TestRunner {

    @Karate.Test
    public Karate test() {
        return Karate.run().relativeTo(getClass());
    }
}
