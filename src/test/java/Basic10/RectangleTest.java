package Basic10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

    Rectangle rectangle;

    @Before
    public void setUpRectangle() {
        rectangle = new Rectangle(3, 4);
    }

    @After
    public void afterSingleTest() {
        System.out.println("After single test case");
    }

    @Test
    public void testCalculateArea() {
        Assert.assertEquals(12, rectangle.calculateArea());
    }


    @Test
    public void testcalculatePerimeter() {
        Assert.assertEquals(14, rectangle.calculatePerimeter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionOnIncorrectValuesInConstructor() {
        new Rectangle(-1, 4);
    }


}
