package com.sunrizeit.onlinebookstore.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

/*import com.sunrizeit.onlinebookstore.entity.Book;
import com.sunrizeit.onlinebookstore.entity.BookCategory;
*/

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
	
	@Autowired
	private EntityManager entitymanager; 
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
			config.exposeIdsFor(entitymanager.getMetamodel().getEntities().stream()
					.map(Type::getJavaType)
					.toArray(Class[]::new));
			//isIdExposedFor(entitymanager.getMetamodel().getEntities().stream()
				//	.map(Type::getJavaType)
					//.toArray(Class[]::new));
			//config.exposeIdsFor(Book.class);
			//config.exposeIdsFor(BookCategory.class);
	}
	
	

}
