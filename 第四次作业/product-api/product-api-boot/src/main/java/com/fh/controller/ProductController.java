package com.fh.controller;

import com.fh.common.ServerResponse;
import com.fh.model.Product;
import com.fh.service.ProductService;
import com.fh.util.AliyunOssUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class ProductController {
 @Resource
 private ProductService productService;
@RequestMapping("queryProductList")
 public ServerResponse queryProductList(Product product){
  return productService.queryProductList(product);
 }

 @RequestMapping("addProduct")
 public ServerResponse addProduct(Product product){
  return productService.addProduct(product);
 }
 @RequestMapping("showArea")
 public ServerResponse showArea(Integer pid){
  return productService.showArea(pid);
 }

 @RequestMapping("deleteProduct")
 public ServerResponse deleteProduct(Integer id){
  return productService.deleteProduct(id);
 }

 @RequestMapping("queryProductById")
 public ServerResponse queryProductById(Integer id){
  return productService.queryProductById(id);
 }

 @RequestMapping("queryAreaByAreaId")
 public ServerResponse queryAreaByAreaId(Integer aid){
  return productService.queryAreaByAreaId(aid);
 }

 @RequestMapping("queryAreaListByPid")
 public ServerResponse queryAreaListByPid(Integer pid){
  return productService.queryAreaListByPid(pid);
 }

 @RequestMapping("updateProduct")
 public ServerResponse updateProduct(Product product){
  return productService.updateProduct(product);
 }

 @RequestMapping("updateProductStatus")
 public ServerResponse updateProductStatus(Integer id,Integer status){
  return productService.updateProductStatus(id,status);
 }

 @RequestMapping("intProduct")
 public ServerResponse intProduct(Integer id,Integer stock){
  return productService.intProduct(id,stock);
 }

 @RequestMapping("outProduct")
 public ServerResponse outProduct(Integer id,Integer stock){
  return productService.outProduct(id,stock);
 }
 @RequestMapping( "uploadOssPhoto")
 public ServerResponse uploadOssPhoto(MultipartFile file, HttpServletRequest request) throws Exception {
  Map map = new HashMap();
  if (file!=null) {// 判断上传的文件是否为空
   String originalFileName = file.getOriginalFilename();
   String url = AliyunOssUtil.uploadFile(file.getInputStream(), originalFileName, "ossimg");
   map.put("imageUrl",url);
  }
  return ServerResponse.success(map);
 }











































}
