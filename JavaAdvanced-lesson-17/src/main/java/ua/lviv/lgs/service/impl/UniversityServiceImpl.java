package ua.lviv.lgs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.UniversityRepository;
import ua.lviv.lgs.domain.University;
import ua.lviv.lgs.service.UniversityService;

@Service
public class UniversityServiceImpl implements UniversityService {

	@Autowired
	public UniversityRepository universityRepository;

	@Override
	public University save(University university) {
		return universityRepository.save(university);
	}

	@Override
	public University findById(Integer id) {
		return universityRepository.getReferenceById(id);
	}

	@Override
	public University update(University university) {
		return universityRepository.save(university);
	}

	@Override
	public void deleteById(Integer id) {
		universityRepository.deleteById(id);

	}

	@Override
	public List<University> findAll() {
		return universityRepository.findAll();
	}

	@Override
	public List<University> findByAccreditationLevel(String accreditationLevel) {
		return universityRepository.findByAccreditationLevel(accreditationLevel);
	}

	@Override
	public List<University> findByInstitutesQuantity(Integer institutesQuantity) {
		return universityRepository.findByInstitutesQuantity(institutesQuantity);
	}

	@Override
	public List<University> findByStudentsQuantity(Integer studentsQuantity) {
		return universityRepository.findByStudentsQuantity(studentsQuantity);
	}

	@Override
	public List<University> findByAdress(String adress) {
		return universityRepository.findByAdress(adress);
	}

}
