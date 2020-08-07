package co.basic.api.mybatis.service;

import co.basic.api.mybatis.mapper.CommonUserMapper;
import co.basic.api.mybatis.vo.CommonUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommonUserServiceImpl implements CommonUserService{

    @Autowired
    private CommonUserMapper commonUserMapper;

    @Override
    public List<CommonUserVo> selectCommonUserList(CommonUserVo param) {

        List<CommonUserVo> commonUserVoList = commonUserMapper.selectCommonUserList(param);

        return commonUserVoList;
    }
}
