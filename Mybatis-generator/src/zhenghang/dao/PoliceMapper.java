package zhenghang.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zhenghang.pojo.Police;
import zhenghang.pojo.PoliceExample;

public interface PoliceMapper {
    int countByExample(PoliceExample example);

    int deleteByExample(PoliceExample example);

    int deleteByPrimaryKey(Integer poliId);

    int insert(Police record);

    int insertSelective(Police record);

    List<Police> selectByExample(PoliceExample example);

    Police selectByPrimaryKey(Integer poliId);

    int updateByExampleSelective(@Param("record") Police record, @Param("example") PoliceExample example);

    int updateByExample(@Param("record") Police record, @Param("example") PoliceExample example);

    int updateByPrimaryKeySelective(Police record);

    int updateByPrimaryKey(Police record);
}