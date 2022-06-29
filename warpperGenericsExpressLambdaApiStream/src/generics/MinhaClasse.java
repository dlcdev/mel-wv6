package generics;

public class MinhaClasse<T> {
    T obj;

    public MinhaClasse(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
