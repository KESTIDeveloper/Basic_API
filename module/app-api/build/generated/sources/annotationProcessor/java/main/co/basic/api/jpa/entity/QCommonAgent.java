package co.basic.api.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommonAgent is a Querydsl query type for CommonAgent
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCommonAgent extends EntityPathBase<CommonAgent> {

    private static final long serialVersionUID = 1963323512L;

    public static final QCommonAgent commonAgent = new QCommonAgent("commonAgent");

    public final StringPath Address = createString("Address");

    public final StringPath agentDetail = createString("agentDetail");

    public final StringPath agentId = createString("agentId");

    public final StringPath agentName = createString("agentName");

    public final NumberPath<Double> lat = createNumber("lat", Double.class);

    public final NumberPath<Double> lon = createNumber("lon", Double.class);

    public QCommonAgent(String variable) {
        super(CommonAgent.class, forVariable(variable));
    }

    public QCommonAgent(Path<? extends CommonAgent> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommonAgent(PathMetadata metadata) {
        super(CommonAgent.class, metadata);
    }

}

