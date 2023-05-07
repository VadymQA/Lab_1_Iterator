package Lab8_Builder;

import java.util.List;

class PostgreSQLQueryBuilder implements QueryBuilder {
    private StringBuilder query = new StringBuilder();

    public QueryBuilder select(String table, List<String> columns) {
        query.append("/* PostgreSQL */ SELECT ").append(String.join(", ", columns)).append(" FROM ").append(table);
        return this;
    }

    public QueryBuilder where(String condition) {
        query.append(" WHERE ").append(condition);
        return this;
    }

    public QueryBuilder limit(int num) {
        query.append(" LIMIT ").append(num);
        return this;
    }

    public String getSQL() {
        return query.toString() + ";";
    }
}
