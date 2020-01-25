package Basic10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

    Rectangle rectangle;
    private static final int DEFAULT_WIDHT = 3;
    private static final int DEFAULT_HIGHT = 4;
    private static final int DEFAULT_AREA = 12;
    private static final int DEFAULT_PERIMETER = 14;

    @Before
    public void setUpRectangle() {
        rectangle = new Rectangle(DEFAULT_WIDHT, DEFAULT_HIGHT);
    }

    @After
    public void afterSingleTest() {
        System.out.println("After single test case");
    }

    @Test
    public void testCalculateArea() {
        Assert.assertEquals(DEFAULT_AREA, rectangle.calculateArea());
    }


    @Test
    public void testcalculatePerimeter() {
        Assert.assertEquals(DEFAULT_PERIMETER, rectangle.calculatePerimeter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionOnIncorrectValuesInConstructor() {
        new Rectangle(-1, 4);
    }


}
