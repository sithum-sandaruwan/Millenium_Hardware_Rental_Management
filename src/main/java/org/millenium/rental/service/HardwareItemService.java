package org.millenium.rental.service;

import org.millenium.rental.dto.HardwareItem;

import java.util.List;

public interface HardwareItemService {
     List<HardwareItem> getAllItems();

    void addItem(HardwareItem item);

    String deleteItemById(Long id);

    void updateCustomerById(HardwareItem item);
}
