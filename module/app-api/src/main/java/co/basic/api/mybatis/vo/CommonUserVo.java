package co.basic.api.mybatis.vo;

import co.basic.api.mybatis.common.vo.BaseVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CommonUserVo extends BaseVo {

    private static final long serialVersionUID = 1L;

    private String userId;

    private String userPw;

    private String userName;

    private String companyName;

    private String teamId;

    private String userRankId;

    private String authId;
}
