package spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan("spring")
@MapperScan("spring")
public class AppConfig {
	@Bean
    public BasicDataSource dataSource() {
       BasicDataSource dataSource = new BasicDataSource();
       dataSource.setDriverClassName("com.mysql.jdbc.Driver");
       dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/pn");
       dataSource.setUsername("root");
       dataSource.setPassword("shubham30");
       return dataSource;
   }
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
      SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
      sessionFactory.setDataSource((javax.sql.DataSource) dataSource());
      return sessionFactory.getObject();
	}
	/*	private static final Logger logger = LoggerFactory.getLogger(AppConfig.class);
	  @Autowired
	  private Environment env;

	  @Bean
	  public DataSource dataSource() {

	    BasicDataSource dataSource = new BasicDataSource();
	    try {
	      dataSource.setDriverClassName(env.getProperty("com.mysql.jdbc.Driver"));
	      dataSource.setUrl("jdbc:mysql://localhost:3306/pn");
	      dataSource.setUsername(env.getProperty("root"));
	      dataSource.setPassword(env.getProperty("shubham30"));
	      logger.info("Initialized data source");
	    } catch (Exception e) {
	        logger.error("Error while initializing data source:", e);
	    }
	    return dataSource;
	  }*/

	  @Bean
	  public DataSourceTransactionManager transactionManager() {
	    return new DataSourceTransactionManager(dataSource());
	  }

	  /*@Bean
	  public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
	    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
	    sqlSessionFactoryBean.setDataSource(dataSource());
	    sqlSessionFactoryBean.setTypeAliasesPackage("spring");
	    return sqlSessionFactoryBean;
	  }*/
  }
