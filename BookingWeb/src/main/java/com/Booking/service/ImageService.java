package com.Booking.service;

import java.util.List;

import com.Booking.entity.Image;

public interface ImageService {

	List<Image> findByTourId(Long id);

	public Image addToTour(Long tourId,String url);

	void deleteById(Long id);
}
