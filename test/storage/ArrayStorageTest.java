import storage.ArrayStorage;
import storage.Storage;

import static org.junit.Assert.*;

public class ArrayStorageTest extends AbstractStorageTest{

    public ArrayStorageTest() {
        super(new ArrayStorage());
    }
}