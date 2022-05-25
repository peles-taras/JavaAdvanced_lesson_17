package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.University;


public interface UniversityService {

	University save(University university);

	University findById(Integer id);

	University update(University university);

	void deleteById(Integer id);

	List<University> findAll();

	List<University> findByAccreditationLevel(String accreditationLevel);

	List<University> findByInstitutesQuantity(Integer institutesQuantity);

	List<University> findByStudentsQuantity(Integer studentsQuantity);

	List<University> findByAdress(String adress);

}
