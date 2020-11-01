package cyker.javatechie.crud.example.repository;

import cyker.javatechie.crud.example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
}

