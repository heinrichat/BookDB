package bookdb.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QAuthor is a Querydsl query type for Author
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAuthor extends EntityPathBase<Author> {

    private static final long serialVersionUID = -1005218418L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAuthor author = new QAuthor("author");

    public final QPerson _super = new QPerson(this);

    //inherited
    public final StringPath address = _super.address;

    //inherited
    public final DateTimePath<java.util.Date> birthday = _super.birthday;

    //inherited
    public final ComparablePath<Character> gender = _super.gender;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public final QPublisher publisher;

    //inherited
    public final DateTimePath<java.util.Date> updateDate = _super.updateDate;

    public QAuthor(String variable) {
        this(Author.class,  forVariable(variable), INITS);
    }

    public QAuthor(Path<? extends Author> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAuthor(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAuthor(PathMetadata<?> metadata, PathInits inits) {
        this(Author.class,  metadata, inits);
    }

    public QAuthor(Class<? extends Author> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.publisher = inits.isInitialized("publisher") ? new QPublisher(forProperty("publisher")) : null;
    }

}

