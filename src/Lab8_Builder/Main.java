package Lab8_Builder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> columns = List.of("id", "name");

        System.out.println("PostgreSQL query:");
        clientCode(new PostgreSQLQueryBuilder(), columns);

        System.out.println("MySQL query:");
        clientCode(new MySQLQueryBuilder(), columns);
    }

    public static void clientCode(QueryBuilder queryBuilder, List<String> columns) {
        queryBuilder.select("users", columns).where("age > 18").limit(10);
        System.out.println(queryBuilder.getSQL());
    }
}
