package pl.lech.hibercar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class StartIntegrationTest {

    @Autowired
    private CarRepo carRepo;

    @Test
    @DisplayName("pokaż czerwony")
    public void shouldReturnSelectedCar() {
        List<Car> car = carRepo.findCarsByColor(Color.RED);
        assertTrue(car.size() > 0);
    }
}