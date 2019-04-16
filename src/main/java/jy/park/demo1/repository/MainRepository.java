package jy.park.demo1.repository;


import jy.park.demo1.model.MainDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepository extends JpaRepository<MainDto, String> {

}
