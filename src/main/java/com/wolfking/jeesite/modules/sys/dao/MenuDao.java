/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.wolfking.jeesite.modules.sys.dao;

import com.wolfking.jeesite.common.persistence.CrudDao;
import com.wolfking.jeesite.modules.sys.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 菜单DAO接口
 *
 * @author ThinkGem
 * @version 2014-05-16
 */
@Mapper
public interface MenuDao extends CrudDao<Menu> {

    List<Menu> findByParentIdsLike(Menu menu);

    List<Menu> findByUserId(Menu menu);

    int updateParentIds(Menu menu);

    int updateSort(Menu menu);

}
