package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Timer {

    @Autowired
    AnimalsCage animalsCage;

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
