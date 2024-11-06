package Servicio;
import Repositorio.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import models.Producto;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto addProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    // Otros métodos según sea necesario
}
