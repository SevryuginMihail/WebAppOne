package sevryugin.spring.music;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * RockMusic.
 *
 * @author Mihail_Sevryugin
 */
@Component
@Scope("prototype")
public class RockMusic implements Music {

//    @Override
//    public String getSong() {
//        return "eeee Roock";
//    }
//
//    public void init() {
//        System.out.println("Init RockMusic bean");
//    }
//
//    public void destroy() {
//        System.out.println("Destroy RockMusic bean");
//    }

    // задание к 11 уроку, далее 12,13 урок
    private List<String> rockList = new ArrayList<>();
    public RockMusic(){
        rockList.add("rock1");
        rockList.add("rock2");
        rockList.add("rock3");
    }

    @PostConstruct
    public void init(){
        System.out.println("init RockMusic");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy RockMusic");
    }

    @Override
    public String getSong() {
        return rockList.get(new Random().nextInt(rockList.size()));
    }
}
