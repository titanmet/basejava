import storage.ListStorage;
import storage.Storage;

import static org.junit.Assert.*;

public class ListStorageTest extends AbstractArrayStorageTest {

    public ListStorageTest() {
        super(new ListStorage());
    }
}