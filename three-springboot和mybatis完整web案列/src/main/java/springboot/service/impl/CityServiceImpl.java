package springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.dao.CityDao;
import springboot.domain.City;
import springboot.service.CityService;

/**
 * Description:
 * User: huangchengdu
 * Date: 2018-08-17
 * Time: 上午8:26
 */

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @java.lang.Override
    public City findCityByName(String cityName) {
        City res = (City)cityDao.findByName(cityName);
        System.out.println("--------------" + res);
        return res;
    }
}
