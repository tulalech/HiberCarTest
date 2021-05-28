package pl.lech.hibercar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private CarRepo carRepo;

    @Autowired
    public Start(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @EventListener(ApplicationEvent.class)
    public void init0() {
        Car carPolonez = new Car("Polonez", "Caro", Color.BLACK);
        Car carFiat = new Car("Fiat", "Panda", Color.GREEN);

        carRepo.save(carPolonez);
//        carRepo.save(carFiat);

        carRepo.findAll().forEach(System.out::println);
    }
}
