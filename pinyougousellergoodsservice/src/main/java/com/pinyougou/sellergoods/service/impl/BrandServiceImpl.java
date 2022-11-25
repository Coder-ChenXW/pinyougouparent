package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.entity.PageResult;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbBrandExample;
import com.pinyougou.sellergoods.service.BrandService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;


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

    /**
     * @param pageNum
     * @param pageSize
     * @Function: 功能描述 分页查询
     * @Author: ChenXW
     * @Date: 23:16 2022/11/21
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<TbBrand> page= (Page<TbBrand>)brandMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult() );
    }

    /**
     * @param brand
     * @param pageNum
     * @param pageSize
     * @Function: 功能描述 分页查询
     * @Author: ChenXW
     * @Date: 23:16 2022/11/21
     */
    @Override
    public PageResult findPage(TbBrand brand, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbBrandExample example=new TbBrandExample();
        TbBrandExample.Criteria criteria = example.createCriteria();
        if(brand!=null){
            if(brand.getName()!=null && brand.getName().length()>0){
                criteria.andNameLike("%"+brand.getName()+"%");
            }
            if(brand.getFirstChar()!=null && brand.getFirstChar().length()>0){
                criteria.andFirstCharEqualTo(brand.getFirstChar());
            }
        }
        Page<TbBrand> page= (Page<TbBrand>)brandMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }


    /**
     * @param brand
     * @Function: 功能描述 增加品牌
     * @Author: ChenXW
     * @Date: 23:36 2022/11/21
     */
    @Override
    public void add(TbBrand brand) {
        brandMapper.insert(brand);
    }

    /**
     * @param id
     * @Function: 功能描述 根据id查询品牌
     * @Author: ChenXW
     * @Date: 23:50 2022/11/21
     */
    @Override
    public TbBrand findOne(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    /**
     * @param brand
     * @Function: 功能描述 修改
     * @Author: ChenXW
     * @Date: 23:51 2022/11/21
     */
    @Override
    public void update(TbBrand brand) {
        brandMapper.updateByPrimaryKey(brand);
    }

    /**
     * @param ids
     * @Function: 功能描述 删除
     * @Author: ChenXW
     * @Date: 0:03 2022/11/22
     */
    @Override
    public void delete(Long[] ids) {
        for(Long id:ids){
            brandMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<Map> selectOptionList() {
        return brandMapper.selectOptionList();
    }
}
