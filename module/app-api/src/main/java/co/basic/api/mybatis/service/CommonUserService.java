package co.basic.api.mybatis.service;

import co.basic.api.mybatis.vo.CommonUserVo;

import java.util.List;

public interface CommonUserService {

    public List<CommonUserVo> selectCommonUserList(CommonUserVo param);
}
