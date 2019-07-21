import lesson1.Car;
import lesson1.CarDto;
import lesson1.CarMapper;
import lesson1.CarType;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * @ProjectName: mapstruct_lab
 * @Package: PACKAGE_NAME
 * @ClassName: CarMapperTest
 * @Author: 吴成昊
 * @Description:
 * @Date: 2019/7/21 12:10
 * @Version: 0.1
 */
public class CarMapperTest {

    @Test
    public void shouldMapCarToDto() {
        //given
        Car car = new Car( "Morris", 5, CarType.SEDAN );

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto( car );

        //then
        assertThat( carDto ,notNullValue());
        assertThat( carDto.getMake(),equalTo( "Morris" ));
        assertThat( carDto.getSeatCount() ,equalTo( 5 ));
        assertThat( carDto.getType(),equalTo( "SEDAN" ));
        System.out.println(carDto);

    }

}
