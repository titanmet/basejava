package exeption;

public class NotExistStorageException extends StorageExeption {

    public NotExistStorageException(String uuid) {
        super("Resume" + uuid + " not exist", uuid);
    }
}
