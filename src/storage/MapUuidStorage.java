package storage;

import model.Resume;

import java.util.*;

public class MapUuidStorage extends AbstractStorage {
    private Map<String, Resume> map = new HashMap<>();

    @Override
    protected String getSearchKey(String uuid) {
        return uuid;
    }

    @Override
    protected void doUpdate(Resume r, Object uuid) {
        map.put((String) uuid, r);
    }

    @Override
    protected boolean isExist(Object uuid) {
        return map.containsKey((String) uuid);
    }

    @Override
    protected void doSave(Resume r, Object uuid) {
        map.put((String) uuid, r);
    }

    @Override
    protected Resume doGet(Object uuid) {
        return map.remove((String) uuid);
    }

    @Override
    protected void doDelete(Object uuid) {
        map.remove((String) uuid);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public List<Resume> doCopyAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public int size() {
        return map.size();
    }

    public static class MapResumeStorage extends AbstractStorage {
        private Map<String, Resume> map = new HashMap<>();

        @Override
        protected Resume getSearchKey(String uuid) {
            return map.get(uuid);
        }

        @Override
        protected void doUpdate(Resume r, Object resume) {
            map.put(r.getUuid(), r);
        }

        @Override
        protected boolean isExist(Object resume) {
            return resume != null;
        }

        @Override
        protected void doSave(Resume r, Object resume) {
            map.put(r.getUuid(), r);
        }

        @Override
        protected Resume doGet(Object resume) {
            return (Resume) resume;
        }

        @Override
        protected void doDelete(Object resume) {
            map.remove(((Resume) resume).getUuid());
        }

        @Override
        public void clear() {
            map.clear();
        }

        @Override
        public List<Resume> doCopyAll() {
            return new ArrayList<>(map.values());
        }

        @Override
        public int size() {
            return map.size();
        }
    }
}