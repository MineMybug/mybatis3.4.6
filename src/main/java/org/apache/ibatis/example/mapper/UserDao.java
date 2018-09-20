package org.apache.ibatis.example.mapper;

import org.apache.ibatis.example.pojo.User;

/**
 * @author: ruanhang
 * @data: 2018年9月19日
 */
public interface UserDao {
	
	User selectOne(int id);

}
