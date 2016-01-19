package ${package}.${artifactId};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class ApplicationWebXml extends SpringBootServletInitializer {

    private final Logger log = LoggerFactory.getLogger(ApplicationWebXml.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // String profile = System.getProperty("spring.profiles.active");
        // return application.profiles(profile).sources(Application.class);
        return application.sources(Application.class);
    }

}