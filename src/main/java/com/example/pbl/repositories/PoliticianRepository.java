package com.example.pbl.repositories;

import com.example.pbl.entity.Citizen;
import com.example.pbl.entity.Politician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PoliticianRepository extends JpaRepository<Politician,Long> {
    Optional<Politician>findByPoliticianId(long id);
    Optional<Politician>findByCitizenCitizenId(Long citizenId);
    List<Politician>findByCitizenNameContainingIgnoreCase(String name);
    void deleteByCitizenCitizenId(Long id);
    List<Politician>findByLevelManagerContainingIgnoreCaseAndAreaManageContainingIgnoreCase(String levelManage,String areaManage);
//    @Query("SELECT t FROM TenBang t WHERE t.tenCot LIKE %?1% COLLATE utf8_general_ci")
//    List<TenBang> findByTenCotWithoutDau(String tenCot);
}
