package co.basic.api.jpa.controller;

import co.basic.api.jpa.entity.CommonAgent;
import co.basic.api.jpa.model.response.ApiResponse;
import co.basic.api.jpa.service.CommonAgentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class CommonAgentController {

    private final CommonAgentService commonAgentService;

    @GetMapping("/CommonAgent")
    public ApiResponse getCommonAgentList() {
        List<CommonAgent> commonAgentList = commonAgentService.getCommonAgentList();
        return ApiResponse.ok(commonAgentList);
    }

}
