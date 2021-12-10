package com.cristiandares.market.persistence.crud;

import com.cristiandares.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //metodo con SQL nativo
    //@Query(value = "SELECT * FROM producto WHERE id_caregoria = ?", nativeQuery = true)
    //List<Producto> getCategoria(int idCategoria);

    //metodo con QueryMethods
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidad_stock, boolean estado);


}
