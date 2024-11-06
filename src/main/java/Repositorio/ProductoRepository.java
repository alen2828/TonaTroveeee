package Repositorio;

import models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Métodos adicionales si es necesario
}
