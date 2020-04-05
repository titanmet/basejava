import storage.MapResumeStorage;
import storage.MapUuidStorage;

public class ArrayStorageTest extends AbstractStorageTest{

    public ArrayStorageTest(MapResumeStorage mapUuidStorage) {
        super(new MapUuidStorage());
    }

    public ArrayStorageTest(MapUuidStorage mapUuidStorage) {
        super(mapUuidStorage);
    }
}