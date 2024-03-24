package com.app.salonbooking.services.impl;

import com.app.salonbooking.models.Barber;
import com.app.salonbooking.repositories.BarberRepository;
// import com.app.salonbooking.repositories.BookingRepository;
import com.app.salonbooking.services.BarberService;
// import com.app.salonbooking.services.CustomerService;
// import com.app.salonbooking.services.ServiceItemService;

import lombok.RequiredArgsConstructor;


import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BarberServiceImpl implements BarberService {

	
    private final BarberRepository barberRepository;
    
    
    

    // public BarberServiceImpl(BarberRepository barberRepository) {
	// 	super();
	// 	this.barberRepository = barberRepository;
	// }




	@Override
    public Barber getBarberById(Integer barberId) {
        return barberRepository.findById(barberId).orElse(null);
    }
}
