
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void area_whenGivenLengthIs4AndBreadthIs3_shouldReturnCalculatedAreaAs12(){
        Rectangle rectangle = new Rectangle(4,3);
        assertEquals(12,rectangle.Area());
    }
    @Test
    public void perimeter_whenGivenLengthIs4AndBreadthIs3_shouldReturnCalculatedPerimeterAs14(){
        Rectangle rectangle = new Rectangle(2,4);
        assertEquals(12,rectangle.Perimeter());
    }
}
