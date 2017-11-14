package mapper;

import com.tianfan.pojo.User;
import com.tianfan.pojo.UserExample;

import java.util.List;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(User record, UserExample example);

    int updateByExample(User record, UserExample example);
}