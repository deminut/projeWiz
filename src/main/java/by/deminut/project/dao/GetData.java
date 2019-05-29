package by.deminut.project.dao;

import by.deminut.project.utils.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class GetData {

    public GetData() {
    }

    public String GetSize(){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        NativeQuery query = session.getSession().createNativeQuery("select * from size", SizeEntity.class);
        List<SizeEntity> sizeEntityList = query.list();
        System.out.println(sizeEntityList);
        session.getTransaction().commit();
        System.out.println("Successfully get size");
        session.close();
        return "Successfully get size";
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
        System.out.println("Successfully get elements");
        session.close();
    }

    public String GetPlayers(){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        NativeQuery query = session.getSession().createNativeQuery("select * from player", PlayerEntity.class);
        List<PlayerEntity> playerEntityList = query.list();
        System.out.println(playerEntityList);
        session.getTransaction().commit();
        System.out.println("Successfully get players");
        session.close();
        return "Successfully get size";
    }

}

