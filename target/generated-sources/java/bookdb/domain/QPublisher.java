package bookdb.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPublisher is a Querydsl query type for Publisher
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPublisher extends EntityPathBase<Publisher> {

    private static final long serialVersionUID = -1978004711L;

    public static final QPublisher publisher = new QPublisher("publisher");

    public final QBasePersistable _super = new QBasePersistable(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    //inherited
    public final DateTimePath<java.util.Date> updateDate = _super.updateDate;

    public QPublisher(String variable) {
        super(Publisher.class,  forVariable(variable));
    }

    public QPublisher(Path<? extends Publisher> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPublisher(PathMetadata<?> metadata) {
        super(Publisher.class,  metadata);
    }

}

