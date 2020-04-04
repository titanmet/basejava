import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import storage.MapUuidStorage;
import storage.SortedArrayStorage;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ArrayStorageTest.class,
                SortedArrayStorageTest.class,
                ListStorageTest.class,
                MapUuidStorageTest.class,
        }
)
public class AllStorageTest {
}
