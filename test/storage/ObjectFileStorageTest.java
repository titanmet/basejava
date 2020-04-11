package storage;

import model.Resume;
import storage.serializer.ObjectStreamSerializer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ObjectFileStorageTest extends AbstractStorageTest {

    public ObjectFileStorageTest() {
        super(new FileStorage(STORAGE_DIR, new ObjectStreamSerializer()) {
            @Override
            protected void doWrite(Resume r, OutputStream file) throws IOException {

            }

            @Override
            protected Resume doRead(InputStream file) throws IOException {
                return null;
            }
        });
    }
}