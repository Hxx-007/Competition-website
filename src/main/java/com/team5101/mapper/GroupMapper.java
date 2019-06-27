package com.team5101.mapper;


import com.team5101.pojo.Group;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GroupMapper {
    //创建小组
    Group addGroup(Group group);
    //查询成员
    Group findMember(String g_name);
    //查询所有小组信息
    List<Group> allGroups();
}