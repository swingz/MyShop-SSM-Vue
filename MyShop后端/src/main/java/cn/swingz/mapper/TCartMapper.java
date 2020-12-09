package cn.swingz.mapper;

import cn.swingz.entity.TCart;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface TCartMapper {
    int deleteByPrimaryKey(Long tcId);

    int insert(TCart record);

    int insertSelective(TCart record);

    TCart selectByPrimaryKey(Long tcId);

    int updateByPrimaryKeySelective(TCart record);

    int updateByPrimaryKey(TCart record);

    List<TCart> selectByUserId(Long userId);

    TCart findCartWithUserIdAndPid(@Param("userId") Long userId,@Param("pid") Long pid);
}