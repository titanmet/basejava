import storage.ArrayStorage;
import storage.MapUuidStorage;
import storage.Storage;

import static org.junit.Assert.*;

public class ArrayStorageTest extends AbstractStorageTest{

    public ArrayStorageTest(MapUuidStorage mapUuidStorage) {
        super(new ArrayStorage());
    }
}