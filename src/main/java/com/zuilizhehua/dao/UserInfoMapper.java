package com.zuilizhehua.dao;

import com.zuilizhehua.dao.po.UserInfoPo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zhaichunlei
 * @Date: 2024/1/9 18:35
 */
@Repository
public interface UserInfoMapper {

    @Select("SELECT * FROM user")
    List<UserInfoPo> selectList();

}
