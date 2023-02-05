public class HelloWorldTest {
    /*
     * Maven surefire runs the method whose name starts
     * with test name. If it doesn't start with test surefire
     * will not run.
     */
    public void testHello() {
        System.out.println("Test - Hello ...");
    }

    public void testWorld() {
        System.out.println("Test - World ...");
    }

    public void xtestMethod() {
        System.out.println("This method in test class will not be run by surefire plugin");
    }
}
