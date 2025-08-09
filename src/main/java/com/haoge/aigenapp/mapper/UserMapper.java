package com.haoge.aigenapp.mapper;

import com.haoge.aigenapp.model.entity.User;
import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户 映射层。
 *
 * 
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}