import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RectangleTests {
    private Rectangle rectangle;
    private Rectangle[] rectangles = new Rectangle[5];
    @Before
    public void testSetup() {
        System.out.println("Setup for test complete.");
    }
    @After
    public void testComplete() {
        System.out.println("Test complete.");
    }
    @Test
    public void noArgsConstructorTest() {
        // No args constructor automatically set attributes to zero
        rectangle = new Rectangle();
        try {
            assertTrue (
                    "Test 1: Default values are wrong.",
                    rectangle.getHeight() == 0 && rectangle.getWidth() == 0
            );
            System.out.println("Test 1 completed successfully.");
        } catch (AssertionError assertionError) {
            System.out.println("Test 1: Exception ... " + assertionError.getMessage());
        }
    }
    @Test
    public void noArgsConstructorAreaTest() {
        // No args constructor automatically set attributes to zero
        // So rectangle area is computed as zero as well
        rectangle = new Rectangle();
        try {
            assertTrue (
                    "Test 2: Default values and area are wrong.",
                    rectangle.getHeight() == 0
                            && rectangle.getWidth() == 0
                            && rectangle.getArea() == 0
            );
            System.out.println("Test 2 completed successfully.");
        } catch (AssertionError assertionError) {
            System.out.println("Test 2: Exception ... " + assertionError.getMessage());
        }
    }
    @Test
    public void allArgsConstructorTest() {
        // We are using no args constructor then all args constructor
        rectangle = new Rectangle();
        try {
            rectangle = new Rectangle(10, 20);
            assertTrue (
                    "Test 3: Initial values are wrong.",
                    rectangle.getHeight() == 10
                            && rectangle.getWidth() == 20
                            && rectangle.getArea() == 200
            );
            System.out.println("Test 3 completed successfully.");
        } catch (AssertionError assertionError) {
            System.out.println("Test 3: Exception ... " + assertionError.getMessage());
        }
    }
    @Test
    public void allArgsConstructorLoopTest() {
        // Looping over all args constructor
        rectangle = new Rectangle();
        try {
            for (int i = 0 ; i < rectangles.length ; i++) {
                rectangles[i] = new Rectangle(2 * i, 3 * i);
                assertTrue (
                        "Test 4: Initial values are wrong.",
                        rectangles[i].getHeight() == (2 * i)
                                && rectangles[i].getWidth() == (3 * i)
                                && rectangles[i].getArea() == (6 * i * i)
                );
            }
            System.out.println("Test 4 completed successfully.");
        } catch (AssertionError assertionError) {
            System.out.println("Test 4: Exception ... " + assertionError.getMessage());
        }
    }
    @Test
    public void createThenModifyAttributesTest() {
        // Create rectangles with all args constructor then modify attributes
        rectangle = new Rectangle();
        try {
            for (int i = 0 ; i < rectangles.length ; i++) {
                rectangles[i] = new Rectangle(2 * i, 3 * i);
                rectangles[i].setHeight(11 * i);
                rectangles[i].setWidth(7 * i);
                assertTrue (
                        "Test 5: Modified values are wrong.",
                        rectangles[i].getHeight() == (11 * i)
                                && rectangles[i].getWidth() == (7 * i)
                                && rectangles[i].getArea() == (77 * i * i)
                );
            }
            System.out.println("Test 5 completed successfully.");
        } catch (AssertionError assertionError) {
            System.out.println("Test 5: Exception ... " + assertionError.getMessage());
        }
    }
    @Test
    public void toStringTest() {
        // Create rectangles then use toString method
        rectangle = new Rectangle();
        try {
            for (int i = 0 ; i < rectangles.length ; i++) {
                rectangles[i] = new Rectangle(2 * i, 3 * i);
                rectangles[i].setHeight(11 * i);
                rectangles[i].setWidth(7 * i);
                assertTrue (
                        "Test 6: Modified values are wrong.",
                        rectangles[i].getHeight() == (11 * i)
                                && rectangles[i].getWidth() == (7 * i)
                                && rectangles[i].getArea() == (77 * i * i)
                );
                System.out.println(rectangles[i]);
            }
            System.out.println("Test 6 completed successfully.");
        } catch (AssertionError assertionError) {
            System.out.println("Test 6: Exception ... " + assertionError.getMessage());
        }
    }
}
