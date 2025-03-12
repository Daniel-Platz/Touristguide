package org.example.touristguidedel2.service;

import org.example.touristguidedel2.model.TouristAttraction;
import org.example.touristguidedel2.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
    private final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public List<TouristAttraction> getAttractions() {
        return touristRepository.getAttractions();
    }

    public TouristAttraction getAttractionByName(String name) {
        return touristRepository.getAttractionByName(name);
    }


    public void saveAttraction (TouristAttraction attraction) {
        touristRepository.saveAttraction(attraction);
    }

    public void updateAttraction (TouristAttraction attraction){
        touristRepository.updateAttraction(attraction);
    }

    public TouristAttraction deleteAttraction (String name) {
       return touristRepository.deleteAttraction(name);
    }


}
