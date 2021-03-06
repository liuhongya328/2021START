package springboot.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springboot.model.RegisterCode;
import springboot.model.Supplier;
@Mapper
public interface RegisterCodeMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table register_code
	 *
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table register_code
	 *
	 * @mbg.generated
	 */
	int insert(RegisterCode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table register_code
	 *
	 * @mbg.generated
	 */
	int insertSelective(RegisterCode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table register_code
	 *
	 * @mbg.generated
	 */
	RegisterCode selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table register_code
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(RegisterCode record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table register_code
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKey(RegisterCode record);

	/**
	 * 根据注册序列号查询用户激活码信息 Title: findRegisterInfo
	 * 
	 * @author QiuSheng Lv
	 * @date 2019-6-19
	 */
	RegisterCode findRegisterInfo(@Param("registerNumber") String registerNumber);
	
	 /**
	   * 查询注册码信息列表
     Title: findRegisterCode
     *@author QiuSheng Lv
     *@date 2019年8月16日
     */
    public List<RegisterCode> findRegisterCode(Map<String, Object> map);
    
    /**
	 * 根据orgId查询注册码信息
	 Title: selectByOrgId
	 *@author QiuSheng Lv
	 *@date 2019年9月21日
	 */
	RegisterCode selectByOrgId(String orgId);
}