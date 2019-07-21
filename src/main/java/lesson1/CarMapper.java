package lesson1;

/**
 * @ProjectName: mapstruct_lab
 * @Package: lesson1
 * @ClassName: CarMapper
 * @Author: 吴成昊
 * @Description:
 * @Date: 2019/7/21 12:09
 * @Version: 0.1
 */

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car);
}
