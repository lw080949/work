package com.fh.service;

import com.fh.common.ResponseEnum;
import com.fh.common.ServerResponse;
import com.fh.mapper.AreaMapper;
import com.fh.mapper.ProductMapper;
import com.fh.model.Area;
import com.fh.model.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
 @Resource
 private ProductMapper productMapper;
 @Resource
 private AreaMapper areaMapper;

 @Override
 public ServerResponse queryProductList(Product product) {
  Map map = new HashMap();
  Integer total = productMapper.queryCount(product);
  List productMap = productMapper.queryProductList(product);
  map.put("draw", product.getDraw());
  map.put("recordsTotal", total);
  map.put("recordsFiltered", total);
  map.put("data", productMap);
  return ServerResponse.success(map);
 }

 @Override
 public ServerResponse showArea(Integer pid) {
  List<Area> areaList= areaMapper.showArea(pid);
  return ServerResponse.success(areaList);
 }

 @Override
 public ServerResponse addProduct(Product product) {
  Product productName = productMapper.selectProductByName(product.getName());
  if (productName != null){
   return ServerResponse.error(ResponseEnum.PRODUCTNAME_IS_EXIST);
  }
  productMapper.addProduct(product);
  return ServerResponse.success();
 }

 @Override
 public ServerResponse deleteProduct(Integer id) {
  productMapper.deleteProduct(id);
  return ServerResponse.success();
 }

 @Override
 public ServerResponse queryProductById(Integer id) {
 Product product= productMapper.queryProductById(id);
  return ServerResponse.success(product);
 }

 @Override
 public ServerResponse queryAreaByAreaId(Integer aid) {
 Area area= areaMapper.queryAreaByAreaId(aid);
  return ServerResponse.success(area);
 }

 @Override
 public ServerResponse queryAreaListByPid(Integer pid) {
  Area area= areaMapper.queryAreaListByPid(pid);
  return ServerResponse.success(area);
 }

 @Override
 public ServerResponse updateProduct(Product product) {
  productMapper.updateProduct(product);
  return ServerResponse.success();
 }

 @Override
 public ServerResponse updateProductStatus(Integer id, Integer status) {
  productMapper.updateProductStatus(id,status);
  return ServerResponse.success();
 }

 @Override
 public ServerResponse intProduct(Integer id, Integer stock) {
  productMapper.intProduct(id,stock);
  return ServerResponse.success();
 }

 @Override
 public ServerResponse outProduct(Integer id, Integer stock) {
  Product product = productMapper.queryProductById(id);
  if (product.getStock() < stock){
   return ServerResponse.error(ResponseEnum.STOCK_IS_SHORT);
  }
  productMapper.outProduct(id,stock);
  return ServerResponse.success();
 }
}
