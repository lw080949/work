package com.fh.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Product extends Page{
 @TableId(value = "id",type = IdType.AUTO)
private Integer id ;//商品唯一标识
private String name;// 商品名称
private BigDecimal price;// 价格
private Long sales;// 销量
private String barCode;//条形码
private Long stock;// 库存
private String imageUrl ;//商品图片
 @DateTimeFormat(pattern = "yyyy-MM-dd")
private Date producedDate;// 生产日期
private Integer shelfLife ;//保质期
private Integer status;// 状态 1代表上架 2代表下架
private Integer areaId ;//产地id
 private Integer isdel;
}
