package com.fh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper extends BaseMapper<Product> {
 Integer queryCount(Product product);

 List queryProductList(Product product);

 void addProduct(Product product);

 void deleteProduct(Integer id);

 Product selectProductByName(String name);

 Product queryProductById(Integer id);

 void updateProduct(Product product);

 void updateProductStatus(@Param("id") Integer id, @Param("status") Integer status);

 void intProduct(@Param("id") Integer id,@Param("stock") Integer stock);

 void outProduct(@Param("id")Integer id,@Param("stock") Integer stock);
}
