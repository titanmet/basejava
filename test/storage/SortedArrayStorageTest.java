import storage.AbstractArrayStorage;
import storage.SortedArrayStorage;
import storage.Storage;

import static org.junit.Assert.*;

public class SortedArrayStorageTest extends AbstractArrayStorageTest {

    public SortedArrayStorageTest() {
        super(new SortedArrayStorage());
    }
}