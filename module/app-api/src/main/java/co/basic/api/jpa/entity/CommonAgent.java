package co.basic.api.jpa.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema="kesti_pms", name="common_agent")
public class CommonAgent {

    @Id
    private String agentId;

    private String agentName;

    private String agentDetail;

    private String Address;

    private Double lat;

    private Double lon;
}
