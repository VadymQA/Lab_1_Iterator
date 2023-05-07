package Lab8_Builder;

import java.util.List;

interface QueryBuilder {
    QueryBuilder select(String table, List<String> columns);

    QueryBuilder where(String condition);

    QueryBuilder limit(int num);

    String getSQL();
}
