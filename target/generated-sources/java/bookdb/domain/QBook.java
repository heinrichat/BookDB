package bookdb.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QBook is a Querydsl query type for Book
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBook extends EntityPathBase<Book> {

    private static final long serialVersionUID = -2070293588L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBook book = new QBook("book");

    public final QBasePersistable _super = new QBasePersistable(this);

    public final QAuthor author;

    public final QCategory category;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath isbn = createString("isbn");

    public final StringPath title = createString("title");

    //inherited
    public final DateTimePath<java.util.Date> updateDate = _super.updateDate;

    public QBook(String variable) {
        this(Book.class,  forVariable(variable), INITS);
    }

    public QBook(Path<? extends Book> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBook(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBook(PathMetadata<?> metadata, PathInits inits) {
        this(Book.class,  metadata, inits);
    }

    public QBook(Class<? extends Book> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.author = inits.isInitialized("author") ? new QAuthor(forProperty("author"), inits.get("author")) : null;
        this.category = inits.isInitialized("category") ? new QCategory(forProperty("category")) : null;
    }

}

