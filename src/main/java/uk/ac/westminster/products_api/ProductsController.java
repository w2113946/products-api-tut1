package uk.ac.westminster.products_api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/products")
public class ProductsController {
    @GetMapping("/{id}")
    public Products getById(@PathVariable long id) {
        return new Products(id, "laptop", 999.99);
    }
}
