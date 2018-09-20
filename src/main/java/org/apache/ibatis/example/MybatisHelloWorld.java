package org.apache.ibatis.example;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.example.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author: ruanhang
 * @data: 2018年9月19日
 */
public class MybatisHelloWorld {
	
	public static void main(String[] args) {
		
		String resource = "org/apache/ibatis/example/configuration.xml";
		Reader reader;
		
		try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new  SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();
            try {
                User user = (User) session.selectOne("org.apache.ibatis.example.mapper.UserDao.selectOne", 1);
                System.out.println(user.getId() + "," + user.getName());
            } finally {
                session.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

}
