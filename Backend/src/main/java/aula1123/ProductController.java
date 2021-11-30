package aula1123;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){

        return ResponseEntity.ok(service.findAll());

    }
    @PostMapping
    public ResponseEntity<Product> insert(@RequestBody Product product){
        return ResponseEntity.ok(service.insert(product));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/decrease/{id}")
    public ResponseEntity<Product> decreaseQuantity(@PathVariable long id){
        return ResponseEntity.ok(service.decrease(id));
    }

}
