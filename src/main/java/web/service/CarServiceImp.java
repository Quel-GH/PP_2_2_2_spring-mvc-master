package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    public List<Car> giveListOfCars(int amount) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "car1", 2001));
        carList.add(new Car(2, "car2", 2002));
        carList.add(new Car(3, "car3", 2003));
        carList.add(new Car(4, "car4", 2004));
        carList.add(new Car(5, "car5", 2005));
        if (amount > carList.size() | amount < 0) {
            amount = carList.size();
        }
        return carList.subList(0, amount);
    }
}
