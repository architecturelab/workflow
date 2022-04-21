package com.architecturelab.inventory.useCases.item;

import com.architecturelab.inventory.core.domain.item.ItemOutput;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetItemOutputUseCaseImpl implements GetItemOutputUseCase {

    @Override
    public ItemOutput execute() {
        return null;
    }
}
