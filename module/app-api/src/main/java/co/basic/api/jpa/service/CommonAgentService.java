package co.basic.api.jpa.service;

import co.basic.api.jpa.entity.CommonAgent;
import co.basic.api.jpa.repository.CommonAgentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CommonAgentService {

    private final CommonAgentRepository commonAgentRepository;

    public CommonAgentService(CommonAgentRepository commonAgentRepository)
    { this.commonAgentRepository = commonAgentRepository;}

    public List<CommonAgent> getCommonAgentList() { return commonAgentRepository.findAll(); }
}
