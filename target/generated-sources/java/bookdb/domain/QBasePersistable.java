package bookdb.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QBasePersistable is a Querydsl query type for BasePersistable
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QBasePersistable extends EntityPathBase<BasePersistable> {

    private static final long serialVersionUID = -1333884678L;

    public static final QBasePersistable basePersistable = new QBasePersistable("basePersistable");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.util.Date> updateDate = createDateTime("updateDate", java.util.Date.class);

    public QBasePersistable(String variable) {
        super(BasePersistable.class,  forVariable(variable));
    }

    public QBasePersistable(Path<? extends BasePersistable> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBasePersistable(PathMetadata<?> metadata) {
        super(BasePersistable.class,  metadata);
    }

}

