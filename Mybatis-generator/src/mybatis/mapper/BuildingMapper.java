package mybatis.mapper;

import java.util.List;
import mybatis.po.Building;
import mybatis.po.BuildingExample;
import org.apache.ibatis.annotations.Param;

public interface BuildingMapper {
    int countByExample(BuildingExample example);

    int deleteByExample(BuildingExample example);

    int deleteByPrimaryKey(Integer builId);

    int insert(Building record);

    int insertSelective(Building record);

    List<Building> selectByExample(BuildingExample example);

    Building selectByPrimaryKey(Integer builId);

    int updateByExampleSelective(@Param("record") Building record, @Param("example") BuildingExample example);

    int updateByExample(@Param("record") Building record, @Param("example") BuildingExample example);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);
}