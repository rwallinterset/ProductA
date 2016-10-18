import org.junit.Test;

/**
 * Created by rwall on 2016-10-17.
 */
public class AppATest {
    @Test(expected = java.lang.NullPointerException.class)
    public void testConvertToTimeNull() {
        AppA.convertToTime(null);
    }
    @Test
    public void testConvertToTimeHistorical() {
        AppA.convertToTime ( 1476753947144L );
    }
    @Test
    public void testConvertToTimeNow() {
        AppA.convertToTime(System.currentTimeMillis());
    }
}
