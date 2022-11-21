package com.pinyougou.sellergoods.service;


import com.pinyougou.pojo.TbBrand;

import java.util.List;

// 品牌的业务接口
public interface BrandService {

    /** 
     * @Function: 功能描述 查询所有品牌
     * @Author: ChenXW
     * @Date: 21:51 2022/11/21
     */
    public List<TbBrand> findAll();

}
