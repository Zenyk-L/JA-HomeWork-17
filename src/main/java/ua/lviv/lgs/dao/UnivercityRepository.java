package ua.lviv.lgs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ua.lviv.lgs.domain.Univercity;

import java.util.List;

public interface UnivercityRepository extends JpaRepository<Univercity, Long>, CrudRepository<Univercity,Long> {

    List<Univercity> findByLevel(String level);

    List<Univercity> findByInstitut(int institut);

    List<Univercity> findByStudent(int student);

    List<Univercity> findByAdress(String adress);
}
