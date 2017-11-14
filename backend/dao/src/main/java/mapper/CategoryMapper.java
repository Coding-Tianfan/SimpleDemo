package mapper;

import com.tianfan.pojo.Category;
import com.tianfan.pojo.CategoryExample;

import java.util.List;


public interface CategoryMapper {
    long countByExample(CategoryExample example);

    int deleteByExample(CategoryExample example);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    int updateByExampleSelective(Category record, CategoryExample example);

    int updateByExample(Category record, CategoryExample example);
}