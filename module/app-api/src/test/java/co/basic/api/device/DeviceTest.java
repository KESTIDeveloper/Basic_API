package co.basic.api.device;

import co.basic.api.repository.DevInfoRepository;
import co.basic.api.repository.DevObsInfoRepository;
import co.basic.api.entity.DevRealtimeObs;
import co.basic.api.model.DevStats;
import co.basic.api.repository.DevRealtimeObsRepository;
import co.basic.api.service.DevMonitorService;
import co.basic.api.service.DevRealtimeObsService;
import co.basic.api.util.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@Slf4j
@SpringBootTest
class DeviceTest {

    @Autowired
    private DevInfoRepository devInfoRepository;

    @Autowired
    private DevObsInfoRepository devObsInfoRepository;

    @Autowired
    private DevRealtimeObsRepository devRealtimeObsRepository;

    @Autowired
    private DevRealtimeObsService devRealtimeObsService;

    @Autowired
    private DevMonitorService devMonitorService;


    @Test
    public void select() {
        String devId = "ST0001";
        String obsItemId = "OBS_PM2P5";
//        List<DevInfo> list = devInfoRepository.findAllByTestDevYn(true);
        List<DevRealtimeObs> list = devRealtimeObsRepository.getLatestObsItemValue(devId, obsItemId, PageRequest.of(0, 1));
        log.info("{}", JsonUtils.toPrettyString(list));

//        List<DevRealtimeObs> list = devRealtimeObsRepository.findAll();
//        log.info("{}", JsonUtils.toPrettyString(list));
    }

    @Test
    public void get() {
        String devId = "ST0001";

        devRealtimeObsService.getDevRealtimeObsMapByDevId(devId);


//            devInfoRepository.findById("ST0006").ifPresent(devInfo -> {
//            log.info("{}", JsonUtils.toPrettyString(devInfo));
//        });
    }

    @Test
    public void stats() {
        DevStats res = devMonitorService.getDevStats();
        log.info("{}", JsonUtils.toPrettyString(res));
    }
}
