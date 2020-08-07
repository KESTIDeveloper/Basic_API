package co.basic.api.mypage;

import co.basic.api.repository.ComRegstDtlRepository;
import co.basic.api.util.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class ComRegstDtlTest {


    @Autowired
    private ComRegstDtlRepository comRegstDtlRepository;


    @Test
    public void list() {
        log.info("{}", JsonUtils.toPrettyString(comRegstDtlRepository.findAll()));

    }


}
