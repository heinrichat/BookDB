package bookdb.repositoryjpa;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = RepositoryJpaPackage.class)
public class RepositoryJpaConfiguration {}
