package com.example.SpringEcom.service;

import com.example.SpringEcom.model.Product;
import com.example.SpringEcom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProducts() {
        // List<Product> productList = repo.findAll();
        // productList.forEach(item -> System.out.println(item.toString()));
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product addOrUpdateProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());

        return repo.save(product);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {
//        List<Product> products = repo.searchProducts(keyword);
//        products.forEach(product -> System.out.println(product.getName()));
        return repo.searchProducts(keyword);
    }
}
