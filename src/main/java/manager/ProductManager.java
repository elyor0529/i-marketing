package manager;

import db.ProductsEntity;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 * Created by elyor on 8/9/2015.
 */
public class ProductManager extends BaseManager<ProductsEntity> {

    public ProductManager() {
        super(new ProductsEntity());
    }

    @Override
    public boolean insert(ProductsEntity t) {
        boolean result = false;
        final Transaction transaction = getSession().getTransaction();

        try {

            transaction.begin();

            final String sql = "INSERT INTO products(photo_url,description,name,mark,company_id) " +
                    "VALUES(:photo_url,:description,:name,:mark,:company_id);";
            final Query query = getSession().createSQLQuery(sql);

            query.setProperties(t);

            result = query.executeUpdate() > 0;

            transaction.commit();

        } catch (Exception ext) {

            transaction.rollback();

            ext.printStackTrace();
        }

        return result;
    }

    @Override
    public boolean update(ProductsEntity t) {
        boolean result = false;
        final Transaction transaction = getSession().getTransaction();

        try {

            transaction.begin();

            final String sql = "UPDATE products SET photo_url=:photo_url," +
                    "description=:description," +
                    "name=:name," +
                    "mark=:mark," +
                    "company_id=:company_id " +
                    "WHERE id=:id;";
            final Query query = getSession().createSQLQuery(sql);

            query.setProperties(t);

            result = query.executeUpdate() > 0;

            transaction.commit();

        } catch (Exception ext) {

            transaction.rollback();

            ext.printStackTrace();
        }

        return result;
    }

    @Override
    public boolean delete(int id) {
        boolean result = false;
        final Transaction transaction = getSession().getTransaction();

        try {

            transaction.begin();

            final String sql = "DELETE FROM products WHERE id=:id;";
            final Query query = getSession().createSQLQuery(sql);

            query.setParameter("id", id);

            result = query.executeUpdate() > 0;

            transaction.commit();

        } catch (Exception ext) {
            transaction.rollback();

            ext.printStackTrace();
        }

        return result;
    }

}
