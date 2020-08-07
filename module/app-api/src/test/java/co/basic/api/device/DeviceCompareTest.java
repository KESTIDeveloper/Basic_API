package co.basic.api.device;

import co.basic.api.entity.DevInfo;
import co.basic.api.repository.DevInfoRepository;
import co.basic.api.service.DevInfoService;
import co.basic.api.repository.DevCompareRepository;
import co.basic.api.repository.DevRealtimeObsRepository;
import co.basic.api.service.DevRealtimeObsService;
import co.basic.api.util.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class DeviceCompareTest {

    @Autowired
    private DevInfoRepository devInfoRepository;

    @Autowired
    private DevCompareRepository devCompareRepository;

    @Autowired
    private DevRealtimeObsRepository devRealtimeObsRepository;

    @Autowired
    private DevRealtimeObsService devRealtimeObsService;

    @Autowired
    private DevInfoService devInfoService;


    @Test
    public void select() {
        String devId = "ST0001";

        List<DevInfo> list = devCompareRepository.getDevCompareByDevId(devId);
//        List<DevCompare> list = devCompareRepository.findAllByDevCompareKeyDevId(devId);
        log.info("{}", JsonUtils.toPrettyString(list));
    }

    @Test
    public void compare() {
        List<String> res = devInfoRepository.getDevInfoCountryStats(true);
        log.info("{}", JsonUtils.toPrettyString(res));

    }
}
