package org.boldbit.illusionbackend.apigeneratorservice.model;

import java.util.Map;

public record Endpoint(
        String id,
        String projectId,
        String url,
        Map<String, Boolean> allowedMethods,
        Map<String, Object> schema
) {
}
