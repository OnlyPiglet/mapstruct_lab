package lesson1;

/**
 * @ProjectName: mapstruct_lab
 * @Package: lesson1
 * @ClassName: CarDto
 * @Author: 吴成昊
 * @Description:
 * @Date: 2019/7/21 12:08
 * @Version: 0.1
 */
public class CarDto {

    private String make;
    private int seatCount;
    private String type;

    public CarDto() {
    }

    public CarDto(String make, int seatCount, String type) {
        this.make = make;
        this.seatCount = seatCount;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "make='" + make + '\'' +
                ", seatCount=" + seatCount +
                ", type='" + type + '\'' +
                '}';
    }
}