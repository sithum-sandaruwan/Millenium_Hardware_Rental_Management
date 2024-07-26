package org.millenium.rental.controller;

import lombok.RequiredArgsConstructor;
import org.millenium.rental.dto.Customer;
import org.millenium.rental.dto.HardwareItem;
import org.millenium.rental.service.CustomerService;
import org.millenium.rental.service.HardwareItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hardware-item-controller")
public class HardwareItemController {

//    List<Customer> customers = new ArrayList();

    final HardwareItemService hardwareItemService;

    @PostMapping("/add-item")
    public void addItem(@RequestBody HardwareItem item) {

        hardwareItemService.addItem(item);
    }

    @GetMapping("/get-all-items")
    public List<HardwareItem> getAllItems() {

        return hardwareItemService.getAllItems();
    }

    @DeleteMapping("/delete-item/{id}")
    public String deleteItemById(@PathVariable Long id) {

        return hardwareItemService.deleteItemById(id);

    }

    @PostMapping("/update-item")
    public void updateItemById(@RequestBody HardwareItem item) {

        hardwareItemService.updateCustomerById(item);

    }


}
