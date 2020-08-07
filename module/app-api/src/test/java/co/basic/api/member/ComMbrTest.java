package co.basic.api.member;

import co.basic.api.service.ComMbrService;
import co.basic.api.entity.ComMbr;
import co.basic.api.entity.ComRegst;
import co.basic.api.repository.ComMbrRepository;
import co.basic.api.repository.ComRegstRepository;
import co.basic.api.service.HttpClientTemplate;
import co.kesti.smartcity.service.*;
import co.basic.api.util.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@Slf4j
@SpringBootTest
class ComMbrTest {

    @Autowired
    private HttpClientTemplate httpClientTemplate;

    @Autowired
    private ComMbrRepository comMbrRepository;

    @Autowired
    private ComMbrService comMbrService;

    @Autowired
    private ComRegstRepository comRegstRepository;

    @Test
    public void mbrList() {

        List<ComMbr> rse = comMbrRepository.findAllByMbrClasIn(Lists.newArrayList("0001", "0002"));
        log.info("{}", JsonUtils.toPrettyString(rse));

        log.info("{}", JsonUtils.toPrettyString(comMbrService.selectAdminMbrList()));

    }

    @Test
    public void comregstTest() {
        List<ComRegst> list = comRegstRepository.findAll();
        log.info("{}", JsonUtils.toPrettyString(list));
    }

    @Test
    public void countryTest() throws IOException {
        String aa = getCountry("203.236.8.208");

        log.info("{}", aa);
    }


    public String getCountry(String ip) {
        String response =  httpClientTemplate.get("http://ip2c.org/"+ip, String.class);
        String[] data = StringUtils.split(response, ";");
        if (data.length >=3) {
            return String.format("%s;%s", data[1], data[2]);
        } else {
            return "";
        }
    }
}
