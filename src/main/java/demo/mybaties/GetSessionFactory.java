package demo.mybaties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.InputStream;

/**
 * 创建sqlSession
 */
public class GetSessionFactory {
    private static SqlSessionFactory sqlSessionFactory;
    private GetSessionFactory(){

    }
    /**
     * 
     * @return
     */
   synchronized public static SqlSessionFactory getSqlSessionFactory(){
        if(sqlSessionFactory==null){
            String resources="mybatis-config.xml";
            InputStream inputStream=null;
            try {
                inputStream= Resources.getResourceAsStream(resources);
            }catch (Exception e){
                e.printStackTrace();
            }
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        }
        return sqlSessionFactory;

    }
}