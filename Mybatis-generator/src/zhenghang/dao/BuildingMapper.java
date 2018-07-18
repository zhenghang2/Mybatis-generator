package zhenghang.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhenghang.pojo.Building;
import zhenghang.pojo.BuildingExample;

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