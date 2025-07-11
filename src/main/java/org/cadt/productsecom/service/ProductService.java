package org.cadt.productsecom.service;

import org.cadt.productsecom.dto.ProductResponseDTO;
import org.cadt.productsecom.entity.Product;

import java.util.List;

public interface ProductService {
    ProductResponseDTO saveProduct(Product product);

    List<ProductResponseDTO> getAllProducts();

    ProductResponseDTO getProductById(Long id);

    ProductResponseDTO updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}
