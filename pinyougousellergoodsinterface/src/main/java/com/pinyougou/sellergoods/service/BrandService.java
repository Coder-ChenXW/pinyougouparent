package com.pinyougou.sellergoods.service;


import com.pinyougou.entity.PageResult;
import com.pinyougou.pojo.TbBrand;

import java.util.List;
import java.util.Map;

// 品牌的业务接口
public interface BrandService {

    /**
     * @Function: 功能描述 查询所有品牌
     * @Author: ChenXW
     * @Date: 21:51 2022/11/21
     */
    public List<TbBrand> findAll();


    /**
     * @Function: 功能描述 分页查询
     * @Author: ChenXW
     * @Date: 23:16 2022/11/21
     */
    public PageResult findPage(int pageNum, int pageSize);


    /**
     * @Function: 功能描述 分页查询
     * @Author: ChenXW
     * @Date: 23:16 2022/11/21
     */
    public PageResult findPage(TbBrand brand, int pageNum,int pageSize);


    /**
     * @Function: 功能描述 增加品牌
     * @Author: ChenXW
     * @Date: 23:36 2022/11/21
     */
    public void add(TbBrand brand);

    /**
     * @Function: 功能描述 根据id查询品牌
     * @Author: ChenXW
     * @Date: 23:50 2022/11/21
     */
    public TbBrand findOne(Long id);


    /**
     * @Function: 功能描述 修改
     * @Author: ChenXW
     * @Date: 23:51 2022/11/21
     */
    public void update(TbBrand brand);


    /**
     * @Function: 功能描述 删除
     * @Author: ChenXW
     * @Date: 0:03 2022/11/22
     */
    public void delete(Long[] ids);


    // 下拉列表数据
    public List<Map> selectOptionList();
}
