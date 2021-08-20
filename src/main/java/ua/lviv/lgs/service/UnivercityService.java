package ua.lviv.lgs.service;

import ua.lviv.lgs.domain.Univercity;

import java.util.List;

public interface UnivercityService {

    Univercity save(Univercity univercity);

    Univercity findById(Long id);

    Univercity update(Univercity univercity);

    void deleteById(Long id);

    List<Univercity> findAll();

    List<Univercity> findByLevel(String level);

    List<Univercity> findByInstitut(int institut);

    List<Univercity> findByStudent(int student);

    List<Univercity> findByAdress(String adress);


}
