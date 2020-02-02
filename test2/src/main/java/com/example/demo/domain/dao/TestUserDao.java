package com.example.demo.domain.dao;

import com.example.demo.domain.entity.TestUser;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
/**
 * @author test
 */

@Dao
@ConfigAutowireable
public interface TestUserDao {

    /**
     * @param id
     * @return the TestUser entity
     */
    @Select
    TestUser selectById(Integer id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TestUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TestUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TestUser entity);
}