package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * @Function: 功能描述 品牌服务层实现
 * @Author: ChenXW
 * @Date: 21:53 2022/11/21
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper brandMapper;

    /**
     * @Function: 功能描述 查询所有品牌
     * @Author: ChenXW
     * @Date: 21:51 2022/11/21
     */
    @Override
    public List<TbBrand> findAll() {
        return brandMapper.selectByExample(null);
    }
}
