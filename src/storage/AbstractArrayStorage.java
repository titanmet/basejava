package storage;

import exeption.StorageExeption;
import model.Resume;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractArrayStorage extends AbstractStorage {
    public static final int STORAGE_LIMIT = 10000;
    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size = 0;

    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    @Override
    public void doUpdate(Resume r, Object index) {
        storage[(Integer)index] = r;
    }

    @Override
    public void doSave(Resume r, Object index) {
        if(size == STORAGE_LIMIT) {
           throw new StorageExeption("Storage overflow", r.getUuid());
        } else {
            insertElement(r,(Integer) index);
            size++;
        }
    }

    public Resume doGet(Object index) {
        return storage[(Integer) index];
    }

    @Override
    protected boolean isExist(Object index) {
        return (Integer) index >= 0;
    }

    protected abstract int getIndex(String uuid);

    @Override
    public void doDelete(Object index) {
            fillDeletedElement((Integer) index);
            storage[size - 1] = null;
            size--;
    }

    public Resume[] getAll() {
        return Arrays.copyOfRange(storage, 0, size);
    }

    public int size() {
        return size;
    }

    protected abstract void fillDeletedElement(int index);

    protected abstract void insertElement(Resume r, int index);

    protected abstract Integer getSearchKey(String uuid);

}
