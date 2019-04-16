package jy.park.demo1.service;

import jy.park.demo1.model.MainDto;
import jy.park.demo1.repository.MainRepository;
import jy.park.demo1.util.FileUtil;
import jy.park.demo1.util.MapUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class IndexService {

    @Autowired
    MainRepository repository;

    public List<MainDto> selectAll() {
        log.debug("LOG DEBUG");
        return repository.findAll();
    }


    public String insertAll(String filePath){
        repository.deleteAll();

        FileUtil.getFileInfoByRow(filePath).forEach(row -> {
            Map<String, String> param = MapUtil.convertToMapForDto(MainDto.class, row);

            log.debug("insert data >>> " + param);

            repository.save(new MainDto()
                    .builder()
                    .id(param.get("id"))
                    .name(param.get("name"))
                    .description(param.get("description"))
                    .build());
        });

        return "Success";
    }

}
