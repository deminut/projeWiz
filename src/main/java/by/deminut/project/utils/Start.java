package by.deminut.project.utils;

import by.deminut.project.dao.ElementsEntity;
import by.deminut.project.dao.EnemyEntity;
import by.deminut.project.dao.SizeEntity;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Start {

    public Start() {
    }

    public void GetSize(){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        NativeQuery query = session.getSession().createNativeQuery("select * from size", SizeEntity.class);
        List<SizeEntity> sizeEntityList = query.list();
        System.out.println(sizeEntityList);
        session.getTransaction().commit();
        System.out.println("Successfully get size");
        session.close();
    }

    public void GetEnemies(){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        NativeQuery query = session.getSession().createNativeQuery("select * from enemy", EnemyEntity.class);
        List<EnemyEntity> enemyList = query.list();
        System.out.println(enemyList);
        session.getTransaction().commit();
        System.out.println("Successfully get enemies");
        session.close();
    }

    public void GetElement(){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        NativeQuery query = session.getSession().createNativeQuery("select * from elements", ElementsEntity.class);
        List<ElementsEntity> elementsEntityList = query.list();
        System.out.println(elementsEntityList);
        session.getTransaction().commit();
        System.out.println("Successfully get enemies");
        session.close();
    }
}
