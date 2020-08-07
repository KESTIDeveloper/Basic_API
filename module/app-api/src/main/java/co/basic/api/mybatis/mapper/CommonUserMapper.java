package co.basic.api.mybatis.mapper;

import co.basic.api.mybatis.vo.CommonUserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommonUserMapper {
    /**
     * 회원 정보 목록
     */
    public List<CommonUserVo> selectCommonUserList(CommonUserVo param);
}
