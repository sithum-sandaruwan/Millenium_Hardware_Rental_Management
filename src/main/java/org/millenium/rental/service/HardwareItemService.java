package org.millenium.rental.service;

import org.millenium.rental.dto.HardwareItem;

import java.util.List;

public interface HardwareItemService {
     List<HardwareItem> getAllItems();

    void addItem(HardwareItem item);

    void deleteItemById(Long id);

    void updateItemById(HardwareItem item);
}
