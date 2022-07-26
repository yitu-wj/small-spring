package com.cafebabe.springframework.core.io;

public interface ResourceLoader {
    /**
     * Pseudo URL preFix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
