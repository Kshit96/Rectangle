
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void area_whenGivenLengthIs4AndBreadthIs3_shouldReturnCalculatedAreaAs12(){
        Rectangle rectangle = new Rectangle(4,3);
        assertEquals(12,rectangle.area());
    }
    @Test
    public void perimeter_whenGivenLengthIs4AndBreadthIs3_shouldReturnCalculatedPerimeterAs14(){
        Rectangle rectangle = new Rectangle(2,4);
        assertEquals(12,rectangle.perimeter());
    }
    @Test
    public void area_whenGivenLengthOfSideIs2_shouldReturnCalculatedAreaAs4(){
        Rectangle rectangle = new Rectangle(2);
        assertEquals(4,rectangle.area());
    }
}
