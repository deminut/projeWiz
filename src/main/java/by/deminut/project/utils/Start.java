package by.deminut.project.utils;

import by.deminut.project.dao.ElementsEntity;
import by.deminut.project.dao.EnemyEntity;
import by.deminut.project.dao.GetData;
import by.deminut.project.dao.SizeEntity;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Start {

    public Start() {
    }

    public void start(){
        GetData getData = new GetData();
        getData.GetElement();
        getData.GetEnemies();
        getData.GetSize();
        getData.GetPlayers();

    }
}
