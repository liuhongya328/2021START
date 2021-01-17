package springboot.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springboot.model.User;

@Mapper
public interface UserMapper {
	/**
	 * 删除用户 Title: deleteByPrimaryKey
	 * 
	 * @author QiuSheng Lv
	 * @date 2019-6-21
	 */
	int deleteByPrimaryKey(String userId);

	/**
	 * 插入用户信息 Title: insert
	 * 
	 * @author QiuSheng Lv
	 * @date 2019-6-21
	 */
	int insert(User user);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table user
	 *
	 * @mbg.generated
	 */
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table user
	 *
	 * @mbg.generated
	 */
	User selectByPrimaryKey(String userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table user
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table user
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKey(User record);

	/*
	 * 根据unionid查询用户信息
	 */
	User findUserInfo(String unionid);

	/**
	 * 查询所有用户信息 Title: findAllUser
	 * 
	 * @author QiuSheng Lv
	 * @date 2019-6-21
	 */
	List<User> findAllUser(Map<String, Object> map);
	
	/**
	 * 根据机构和微信号查询用户
	 Title: fingUserByOrg
	 *@author QiuSheng Lv
	 *@date 2019年6月26日
	 */
	List<User> findUserByOrg(Map<String, Object> map);
	
	/**
	 * 查询用户是否存在
	 Title: finfindUserIsExist
	 *@author QiuSheng Lv
	 *@date 2019年6月30日
	 */
	User findUserIsExist(Map<String, Object> map);
	
	/**
	 * 修改密码
	 Title: updatePwd
	 *@author QiuSheng Lv
	 *@date 2019年9月20日
	 */
	int updatePwd(String userId,String userPaw);
}