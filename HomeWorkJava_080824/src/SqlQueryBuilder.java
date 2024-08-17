public class SqlQueryBuilder {

        public static void main(String[] args) {
            // Пример входных данных
            String[] params = {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", "true"};

            String query = buildSqlQuery(params);
            System.out.println("SQL запрос: " + query);
        }

        // Метод для построения SQL-запроса
        public static String buildSqlQuery(String[] params) {
            StringBuilder queryBuilder = new StringBuilder("SELECT * FROM cars WHERE ");
            boolean firstCondition = true;

            for (int i = 0; i < params.length; i += 2) {
                String key = params[i];
                String value = (i + 1 < params.length) ? params[i + 1] : null;

                if (key != null && value != null) {
                    if (!firstCondition) {
                        queryBuilder.append(" AND ");
                    }
                    queryBuilder.append(key).append(" = '").append(value).append("'");
                    firstCondition = false;
                }
            }

            return queryBuilder.toString();
        }
    }


