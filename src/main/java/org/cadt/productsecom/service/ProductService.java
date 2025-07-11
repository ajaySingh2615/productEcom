package org.cadt.productsecom.service;

import org.cadt.productsecom.dto.ProductRequestDTO;
import org.cadt.productsecom.dto.ProductResponseDTO;
import org.cadt.productsecom.entity.Product;

import java.util.List;

public interface ProductService {
    ProductResponseDTO saveProduct(ProductRequestDTO productRequestDTO);

    List<ProductResponseDTO> getAllProducts();

    ProductResponseDTO getProductById(Long id);

    ProductResponseDTO updateProduct(Long id, ProductRequestDTO productRequestDTO);

    void deleteProduct(Long id);
}
