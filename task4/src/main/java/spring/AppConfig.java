package spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
@ComponentScan("spring")
@MapperScan("spring")
public class AppConfig {
	 
		private static final Logger logger = LoggerFactory.getLogger(AppConfig.class);
	  @Autowired
	  private Environment env;

	  @Bean
	  public DataSource dataSource() {

	    BasicDataSource dataSource = new BasicDataSource();
	    try {
	      dataSource.setDriverClassName(env.getProperty("ds.driver.class.name"));
	      dataSource.setUrl(env.getProperty("ds.url"));
	      dataSource.setUsername(env.getProperty("ds.username"));
	      dataSource.setPassword(env.getProperty("ds.password"));
	      logger.info("Initialized data source");
	    } catch (Exception e) {
	        logger.error("Error while initializing data source:", e);
	    }
	    return dataSource;
	  }

	  @Bean
	  public DataSourceTransactionManager transactionManager() {
	    return new DataSourceTransactionManager(dataSource());
	  }

	  @Bean
	  public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
	    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
	    sqlSessionFactoryBean.setDataSource(dataSource());
	    sqlSessionFactoryBean.setTypeAliasesPackage("spring");
	    return sqlSessionFactoryBean;
	  }
  }
