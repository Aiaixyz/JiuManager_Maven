package com.aiaixyz.jiumanager.dao;

import com.aiaixyz.jiumanager.entity.po.Sku;

import java.util.List;

/**
 * author LeeC
 * since JDK 1.8
 * date 2023/3/14
 */
public interface SkuDao {

    int inSkuQuantity(int sku,int num);

    int outSkuQuantity(int sku,int num);

    //添加对象
    int addBean(Sku sku);

    //通过Sku删除对象
    int deleteBeanBySku(int sku);

    //通过Sku修改对象
    int updateBeanBySku(Sku sku);

    //通过对象名获取数量
    int countName(String name);

    //获取所有的Sku数量
    int getTotalCount();

    //通过对象名获取Sku
    int getSkuByName(String username);

    //获取所有对象
    List<Sku> getList();

    //获取所有对象（分页查询）
    List<Sku> getList(int offset, int selectNum);

    //通过Sku获取对象
    List<Sku> getBeanBySku(int id);

    //通过对象名
    List<Sku> getListByName(String username);
}
