package demo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import demo.mapper.UserMapper;
import demo.mybaties.GetSessionFactory;
import demo.vo.UserModel;

public class MybatiesTest {

    @Test
    public void  getAll(){
        SqlSessionFactory sqlSessionFactory=GetSessionFactory.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<UserModel> allUser = mapper.findAllUser();
        allUser = mapper.findAllUser();
        for (UserModel u:allUser) {
            System.out.println(u);
        }
    }

//    @Test
//    public void create(){
//    	UserModel user=new UserModel();
//        user.setUsername("ywl");
//        user.setPassword("ywl");
//        System.out.println(user);
//        SqlSessionFactory sqlSessionFactory=GetSessionFactory.getSqlSessionFactory();
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int i = mapper.addUser(user);
//        sqlSession.commit();
//        System.out.println(user);
//        System.out.println(i);
//    }
//
//    @Test
//    public  void delete(){
//      SqlSessionFactory sqlSessionFactory=GetSessionFactory.getSqlSessionFactory();
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int i = mapper.deleteUserById(1);
//        sqlSession.commit();
//        System.out.println(i);
//
//    }
//
//    @Test
//    public void update(){
//        UserModel u=new UserModel();
//        u.setId(7);
//        u.setPassword("hsj18731362155");
//        u.setUsername("胡少君");
//        SqlSessionFactory sqlSessionFactory=GetSessionFactory.getSqlSessionFactory();
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int i = mapper.updateUser(u);
//        sqlSession.commit();
//        System.out.println(i);
//    }
}
