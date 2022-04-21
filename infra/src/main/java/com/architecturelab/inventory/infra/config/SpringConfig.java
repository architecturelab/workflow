package com.architecturelab.inventory.infra.config;

import com.architecturelab.inventory.infra.jpa.ItemInputJpaRepository;
import com.architecturelab.inventory.infra.jpa.adapter.ItemInputJpaAdapter;
import com.architecturelab.inventory.infra.jpa.dao.ItemInputJpaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.architecturelab.inventory"})
@EntityScan("com.architecturelab.inventory")
public class SpringConfig {

    @Autowired
    private ItemInputJpaDao itemInputJpaDao;
}
