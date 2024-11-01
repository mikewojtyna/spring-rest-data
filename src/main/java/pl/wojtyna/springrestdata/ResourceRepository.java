package pl.wojtyna.springrestdata;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "resources", path = "resources")
public interface ResourceRepository extends MongoRepository<Resource, String> {}



