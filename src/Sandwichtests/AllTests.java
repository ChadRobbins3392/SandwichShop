package Sandwichtests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ BreadTests.class, CheeseTest.class, MeatTests.class, TomatoTests.class, FullOrderTests.class })
public class AllTests {

}
