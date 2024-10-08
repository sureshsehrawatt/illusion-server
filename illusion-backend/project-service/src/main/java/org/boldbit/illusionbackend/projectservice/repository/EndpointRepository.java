package org.boldbit.illusionbackend.projectservice.repository;

import org.boldbit.illusionbackend.projectservice.model.Endpoint;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface EndpointRepository extends MongoRepository<Endpoint, String> {
    Optional<Endpoint> findByProjectIdAndPath(String projectId, String path);

    List<Endpoint> findAllByProjectId(String ownerId);
}
