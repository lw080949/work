package com.fh.service;

import com.fh.common.ServerResponse;
import com.fh.model.Product;

public interface ProductService {
 ServerResponse queryProductList(Product product);

 ServerResponse showArea(Integer pid);

 ServerResponse addProduct(Product product);

 ServerResponse deleteProduct(Integer id);

 ServerResponse queryProductById(Integer id);

 ServerResponse queryAreaByAreaId(Integer aid);

 ServerResponse queryAreaListByPid(Integer pid);

 ServerResponse updateProduct(Product product);

 ServerResponse updateProductStatus(Integer id, Integer status);

 ServerResponse intProduct(Integer id, Integer stock);

 ServerResponse outProduct(Integer id, Integer stock);
}
