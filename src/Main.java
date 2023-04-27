public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

//    Структура таблиц:
//
//        Countries (Страны):
//        country_id (int, primary key) - уникальный идентификатор страны
//        country_name (varchar) - название страны
//        Regions (Области/штаты/провинции):
//        region_id (int, primary key) - уникальный идентификатор области/штата/провинции
//        region_name (varchar) - название области/штата/провинции
//        country_id (int, foreign key) - ссылка на идентификатор страны в таблице Countries
//        Cities (Населенные пункты):
//        city_id (int, primary key) - уникальный идентификатор населенного пункта
//        city_name (varchar) - название населенного пункта
//        region_id (int, foreign key) - ссылка на идентификатор области/штата/провинции в таблице Regions