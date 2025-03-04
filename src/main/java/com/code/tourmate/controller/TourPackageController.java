package com.code.tourmate.controller;

import com.code.tourmate.entity.TourPackage;
import com.code.tourmate.repository.TourPackageRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tours")
public class TourPackageController {

    private final TourPackageRepository tourPackageRepository;

    public TourPackageController(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    @GetMapping
    public List<TourPackage> getAllTourPackages() {
        return tourPackageRepository.findAll();
    }

    @PostMapping
    public TourPackage createTourPackage(@RequestBody TourPackage tourPackage) {
        return tourPackageRepository.save(tourPackage);
    }
}
