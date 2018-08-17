package springboot.service;


import springboot.domain.City;

/**
 * Description:
 * User: huangchengdu
 * Date: 2018-08-17
 * Time: 上午8:26
 */
public interface CityService {
    City findCityByName(String cityName);
}
