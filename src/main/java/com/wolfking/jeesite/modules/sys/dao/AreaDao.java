/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.wolfking.jeesite.modules.sys.dao;

import com.wolfking.jeesite.common.persistence.TreeDao;
import com.wolfking.jeesite.modules.sys.entity.Area;
import org.apache.ibatis.annotations.Mapper;

/**
 * 区域DAO接口
 *
 * @author ThinkGem
 * @version 2014-05-16
 */
@Mapper
public interface AreaDao extends TreeDao<Area> {

}
