package generics;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author dougl
 */
public class GenericService<T> {

    private Class<T> entity;

    @PersistenceContext
    private EntityManager entityManager;

    public GenericService(Class<T> entity) {
        this.entity = entity;
    }

    public void save(T entity) {
        this.entityManager.persist(entity);
    }

    public void update(T entity) {
        this.entityManager.merge(entity);
        this.entityManager.flush();
    }

    public T find(Long entityID) {
        T object = this.entityManager.find(entity, entityID);
        this.entityManager.refresh(object);
        return object;
    }

    public List<T> findAll() {
        return this.entityManager
                .createQuery("SELECT e FROM "
                        + this.entity.getSimpleName()
                        + " e WHERE e.ativo = true")
                .getResultList();
    }

    public Class<T> getEntity() {
        return entity;
    }

    public void setEntity(Class<T> entity) {
        this.entity = entity;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
