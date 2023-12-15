package zoo.core;

import zoo.entities.areas.Area;
import zoo.repositories.FoodRepository;
import zoo.repositories.FoodRepositoryImpl;

import java.util.LinkedHashMap;
import java.util.Map;

public class ControllerImpl implements Controller {
    private FoodRepository foodRepository;
    private Map<String, Area> areas;

    public ControllerImpl() {
        this.foodRepository = new FoodRepositoryImpl();
        this.areas = new LinkedHashMap<>();
    }

    @Override
    public String addArea(String areaType, String areaName) {

        return null;
    }

    @Override
    public String buyFood(String foodType) {
        return null;
    }

    @Override
    public String foodForArea(String areaName, String foodType) {
        return null;
    }

    @Override
    public String addAnimal(String areaName, String animalType, String animalName, String kind, double price) {
        return null;
    }

    @Override
    public String feedAnimal(String areaName) {
        return null;
    }

    @Override
    public String calculateKg(String areaName) {
        return null;
    }

    @Override
    public String getStatistics() {
        return null;
    }
}
