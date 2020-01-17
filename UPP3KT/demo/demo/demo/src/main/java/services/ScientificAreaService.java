package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.ScientificArea;
import root.demo.model.ScientificAreaDto;
import root.repository.ScientificAreaRepository;



@Service
public class ScientificAreaService {
	@Autowired
	ScientificAreaRepository sciRepository;
	
	public List<ScientificArea> getAll(){
		return sciRepository.findAll();
	}
	
	public void addScientificArea(ScientificArea s) {
		sciRepository.save(s);
	}
	
	public void updateScientificArea(ScientificArea s) {
		sciRepository.save(s);
	}
	
	public ScientificArea getScientificArea(long id) {
		return sciRepository.getOne(id);
	}
	
	public void deleteScientificArea(Long id) {
		sciRepository.deleteById(id);
	}
	
	public void deleteAllScientificAreas() {
		sciRepository.deleteAll();
	}
	
	public Boolean existsScientificArea(Long id) {
		return sciRepository.existsById(id);
	}
	
	public ScientificArea mapDTO(ScientificAreaDto reviewerDTO){
		
		ScientificArea scientificArea = new ScientificArea();
		
		scientificArea.setId(reviewerDTO.getId());
		scientificArea.setName(reviewerDTO.getName());
		
		return scientificArea;
	}
	
	public ScientificAreaDto mapToDTO(ScientificArea reviewer){
		return new ScientificAreaDto(reviewer);
	}
	
	public List<ScientificAreaDto> mapAllToDTO(){
		
		List<ScientificArea> scientificAreas = getAll();
		List<ScientificAreaDto> scientificAreaDTOs = new ArrayList<>();
		
		for(ScientificArea r : scientificAreas){
			scientificAreaDTOs.add(mapToDTO(r));
		}
		
		return scientificAreaDTOs;
	}
}
