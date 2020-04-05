import storage.ArrayStorage;
import storage.MapResumeStorage;

public class ArrayStorageTest extends AbstractStorageTest{

    public ArrayStorageTest(MapResumeStorage mapUuidStorage) {
        super(new ArrayStorage());
    }
}