package co.basic.api.mybatis.controller;

import co.basic.api.jpa.model.response.ApiResponse;
import co.basic.api.mybatis.service.CommonUserService;
import co.basic.api.mybatis.vo.CommonUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
public class CommonUserController {

    @Autowired
    private CommonUserService commonUserService;

    @GetMapping("/commonUser")
    public ApiResponse<?> selectCommonUserList(CommonUserVo param) {
        List<CommonUserVo> commonUserVoList = commonUserService.selectCommonUserList(param);

        return ApiResponse.ok(commonUserVoList, param);
    }
}
