package demo.mapper;

import java.util.List;

import demo.vo.UserModel;

public interface UserMapper {
		//根据id查询数据
	   UserModel findUserById(int id);

	   //查询所有数据
	   List<UserModel> findAllUser();

	   //添加User
	   int addUser(UserModel u);

	   //根据id删除数据
	   int deleteUserById(int id);

	   //修改User
	   int updateUser(UserModel user);
}
