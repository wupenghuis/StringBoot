package cn.blb.config;


/*@Configuration
@PropertySource("classpath:jdbc.properties")*/
public class JdbcConfig {


    /*@Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    //获取数据库连接池数据源
    @Bean
    public DataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);

        return dataSource;
    }*/
}
