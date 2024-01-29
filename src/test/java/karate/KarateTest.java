package karate;

import com.intuit.karate.junit5.Karate;
import org.example.karate_demo.KarateDemoApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = KarateDemoApplication.class)
public class KarateTest {

    @Karate.Test
    Karate hello1Test() {
        return Karate.run("classpath:karate/hello/hello1.feature");
    }

}
