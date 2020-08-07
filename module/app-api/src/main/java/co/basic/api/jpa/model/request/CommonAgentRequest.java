package co.basic.api.jpa.model.request;

import co.basic.api.jpa.entity.CommonAgent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommonAgentRequest {
    @NotBlank
    private String agentId;

    private String agentName;

    private String agentDetail;

    private String Address;

    private Double lat;

    private Double lon;

    public CommonAgent toCommonAgent() {
        return CommonAgent.builder()
                .agentId(agentId)
                .agentName(agentName)
                .agentDetail(agentDetail)
                .Address(Address)
                .lat(lat)
                .lon(lon)
                .build();
    }
}
