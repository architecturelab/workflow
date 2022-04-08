package com.architecturelab.inventory.infra.jpa;

import com.architecturelab.inventory.core.item.domain.input.ItemInput;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ItemInputJpaRepository extends CrudRepository<ItemInput, UUID> {
}
