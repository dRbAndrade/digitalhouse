package aula1123;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;
    @Transactional(readOnly = true)
    public List<Product> findAll(){

        return repository.findAll();

    }

    @Transactional
    public Product insert(Product product) {

        return repository.save(product);

    }

    @Transactional
    public Product decrease(long id) {
        Product product = repository.getById(id);
        product.setQuantity(product.getQuantity()-1);
        product = repository.save(product);
        return product;
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
