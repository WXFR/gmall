package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserMapper extends Mapper<UmsMember>{
    /**
     *查询所有人
     * @return null
     */
    List<UmsMember> selectAllUser();

}
