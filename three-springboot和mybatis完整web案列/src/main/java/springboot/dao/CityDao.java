package springboot.dao;

import org.apache.ibatis.annotations.Param;
import springboot.domain.City;

/**
 * Description:
 * User: huangchengdu
 * Date: 2018-08-17
 * Time: 上午8:38
 */
public interface CityDao {

    City findByName(@Param("cityName") String cityName);
}
