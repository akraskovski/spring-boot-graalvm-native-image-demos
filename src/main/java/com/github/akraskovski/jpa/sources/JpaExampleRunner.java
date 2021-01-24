package com.github.akraskovski.jpa.sources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaExampleRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(JpaExampleRunner.class);

    private final FooRepository fooRepository;

    public JpaExampleRunner(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        var saved = fooRepository.save(new Foo());
        log.info("Saved entity id: {}", saved.getId());
        fooRepository.findById(saved.getId()).ifPresentOrElse(
            fetched -> log.info("Fetched entity by id: {}", fetched.getId()),
            () -> log.warn("Entity with id: {} was not found", saved.getId())
        );
    }
}
