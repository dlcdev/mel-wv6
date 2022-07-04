package util;

import java.util.List;

public interface Repository<T> {
    public void saveData(T obj);
    public void deleteData(int id);
    public List<T> findAllData();
}
