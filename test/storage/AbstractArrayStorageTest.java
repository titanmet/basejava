import exeption.StorageExeption;
import model.Resume;
import org.junit.Assert;
import org.junit.Test;
import storage.AbstractArrayStorage;
import storage.Storage;

public class AbstractArrayStorageTest extends AbstractStorageTest {
    protected AbstractArrayStorageTest(Storage storage) {
        super(storage);
    }

    @Test(expected = StorageExeption.class)
    public void saveOverflow() throws Exception {
        try {
            for (int i = 4; i <= AbstractArrayStorage.STORAGE_LIMIT; i++) {
                storage.save(new Resume(UUID_1, "Name" + i));
            }
        } catch (StorageExeption e) {
            Assert.fail();
        }
        storage.save(new Resume(UUID_1, "Overflow"));
    }
}
