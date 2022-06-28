import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;

public class TestSample
{

    @Test
    public void testAssertions()
    {
        //test data
        String str1 = new String ("abc");
        String str2 = new String ("abc");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";

        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray =  {"one", "two", "three"};

        //Check that two objects are equal
        //int int_example = 34;
        //int long_example = 34l;
        float f = 23.374f;
        double  d = 23.374d;
        //BigDecimal decimal_f = new BigDecimal(Float.toString(f));
        //BigDecimal decimal_d = new BigDecimal(Double.toString(d));
        double new_f = (double) f;
        //assertEquals(d, new_f );

        //assertEquals(new BigDecimal(23.0), new BigDecimal(23l));

        /*

        //Check that a condition is true
        assertTrue (val1 < val2);

        //Check that a condition is false
        assertFalse(val1 > val2);

        //Check that an object isn't null
        assertNotNull(str1);

        //Check that an object is null
        assertNull(str3);

        //Check if two object references point to the same object
        assertSame(str4,str5);

        //Check if two object references not point to the same object
        assertNotSame(str1,str3);

        //Check whether two arrays are equal to each other.
        assertArrayEquals(expectedArray, resultArray);

         */
    }

}
