
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CollectionTest {
    Collection mn = new Collection();

    @Test
    public void subArraySize() {
        Assert.assertEquals(3,Collection.subArraySize(new int[]{7, 5, 5, 7, 5, 5, 7, 5 ,5 ,6}, 3, 10 ));


    }
}