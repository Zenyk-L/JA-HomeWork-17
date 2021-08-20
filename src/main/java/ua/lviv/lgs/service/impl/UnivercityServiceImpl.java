package ua.lviv.lgs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.UnivercityRepository;
import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityService;

import java.util.List;

@Service
public class UnivercityServiceImpl implements UnivercityService {

    @Autowired
    UnivercityRepository univercityRepository;

    @Override
    public Univercity save(Univercity univercity) {
        return univercityRepository.saveAndFlush(univercity);
    }

    @Override
    public Univercity findById(Long id) {
        return univercityRepository.getById(id);
    }

    @Override
    public Univercity update(Univercity univercity) {
        return univercityRepository.save(univercity);
    }

    @Override
    public void deleteById(Long id) {
        univercityRepository.deleteById(id);
    }

    @Override
    public List<Univercity> findAll() {
        return univercityRepository.findAll();
    }

    @Override
    public List<Univercity> findByLevel(String level) {
        return univercityRepository.findByLevel(level);
    }

    @Override
    public List<Univercity> findByInstitut(int institut) {
        return univercityRepository.findByInstitut(institut);
    }

    @Override
    public List<Univercity> findByStudent(int student) {
        return univercityRepository.findByStudent(student);
    }

    @Override
    public List<Univercity> findByAdress(String adress) {
        return univercityRepository.findByAdress(adress);
    }
}
