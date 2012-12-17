import com.ilopezluna.utils.YoutubeUtil;
import junit.framework.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class YoutubeUtilTest {

    private final String ID = "GQN0jeX07eo";
    private final String GOOD_URL = "http://www.youtube.com/watch?v=" + ID;
    private final String BAD_URL = "http://www.lalal.com/watch?v=" + ID;

    @Test
    public void testGetYoutubeID() throws MalformedURLException {
        String youtubeID = YoutubeUtil.getYoutubeID(GOOD_URL);
        Assert.assertEquals(ID,youtubeID);
    }

    @Test
    public void testBadYoutubeUrl() {
        try {
            YoutubeUtil.getYoutubeID(BAD_URL);
        } catch (MalformedURLException e) {
            Assert.assertEquals(e.getMessage(),BAD_URL);
        }
    }
}
