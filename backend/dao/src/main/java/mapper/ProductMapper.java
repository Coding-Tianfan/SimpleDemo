package mapper;

import com.tianfan.pojo.Product;
import com.tianfan.pojo.ProductExample;

import java.util.List;


public interface ProductMapper {
    long countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    int updateByExampleSelective(Product record, ProductExample example);

    int updateByExample(Product record, ProductExample example);
}