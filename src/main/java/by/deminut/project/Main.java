package by.deminut.project;

import by.deminut.project.dao.EnemyEntity;
import by.deminut.project.dao.PlayerEntity;
import by.deminut.project.dao.SizeEntity;
import by.deminut.project.utils.HibernateSessionFactory;
import by.deminut.project.utils.Start;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import java.util.List;




public class Main {

    public static void main(String[] args) {

        /*System.out.println("Hibernate tutorial");
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        *//*PlayerEntity playerEntity = new PlayerEntity();
        playerEntity.setName("Misha");
        playerEntity.setId(2);
        playerEntity.setHealth(21);
        playerEntity.setMana(22);
        playerEntity.setDefence(23);
        playerEntity.setEvasion(24);
        playerEntity.setLevel(25);
        session.save(playerEntity);*//*
        NativeQuery query = session.getSession().createNativeQuery("select * from player", PlayerEntity.class);
        List<PlayerEntity> list = query.list();
        System.out.println(list);
        session.getTransaction().commit();
        System.out.println("Successfully");
        session.close();*/

        Start start = new Start();
        start.start();
    }
}
