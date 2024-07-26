package org.millenium.rental.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.millenium.rental.dto.HardwareItem;
import org.millenium.rental.entity.HardwareItemEntity;
import org.millenium.rental.repository.HardwareItemRepo;
import org.millenium.rental.service.HardwareItemService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HardwareItemServiceImpl implements HardwareItemService {

    final HardwareItemRepo itemRepo;

    @Override
    public List<HardwareItem> getAllItems() {

        ArrayList<HardwareItem> itemList = new ArrayList<>();

        List<HardwareItemEntity> all = itemRepo.findAll();

        all.forEach(hardwareItemEntity -> {
            itemList.add(new ObjectMapper().convertValue(hardwareItemEntity, HardwareItem.class));
        });
        return itemList;
    }

    @Override
    public void addItem(HardwareItem item) {
        HardwareItemEntity itemEntity = new ObjectMapper().convertValue(item, HardwareItemEntity.class);
        itemRepo.save(itemEntity);
    }

    @Override
    public void deleteItemById(Long id) {

        if (itemRepo.existsById(id)) {
            itemRepo.deleteById(id);
        }
    }

    @Override
    public void updateItemById(HardwareItem item) {

        if (itemRepo.findById(item.getItem_id()).isPresent()) {
            itemRepo.save(new ObjectMapper().convertValue(item, HardwareItemEntity.class));
        }
    }


}
