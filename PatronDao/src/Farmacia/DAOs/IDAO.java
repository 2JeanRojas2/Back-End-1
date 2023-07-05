package Farmacia.DAOs;

public interface IDAO<T> {
    public T guardar(T t);
    public T buscar(Long id);
}
