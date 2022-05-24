package ojc.user.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import ojc.user.model.User;

/**
 * 매퍼 클래스
 * board쪽고 달리 loign쪽은 매퍼 XML 파일 없이 이 자바 매퍼에서 쿼리 처리 다함
 * @return
 */
@Mapper
public interface UserMapper {
	@Insert("INSERT INTO USER_INFO(USER_ID, password) VALUES(#{userId}, #{password})")
	public int insert(User user);

	@Update("UPDATE USER_INFO SET password = #{password} WHERE USER_ID = #{userId}")
	public int update(User user);

	@Delete("DELETE FROM USER_INFO WHERE USER_ID = #{userId}")
	public int delete(String userId);

	@Select("SELECT COUNT(*) FROM USER_INFO")
	public int count();

	@Select("SELECT * FROM USER_INFO ORDER BY USER_ID ASC")
	@ResultType(User.class) 
	public List<User> selectAll();

	@Select("SELECT * FROM USER_INFO WHERE USER_ID = #{userId}")
	// 선언해 놓으면 다른 메소드에서 @ResultMap("userResultMap") 선언으로 이용할 수 있다.
	@Results(id = "userResultMap", value = { 
			@Result(property = "userId", column = "userId"),
			@Result(property = "password", column = "password") })
	public User selectByUserId(String userId);
}
