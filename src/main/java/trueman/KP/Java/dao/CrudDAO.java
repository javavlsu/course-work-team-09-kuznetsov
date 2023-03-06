package ru.truemen.laba3.dao;

import java.sql.SQLException;
import java.util.List;

public interface CrudDAO<T, U> {
    int createOne(T object) throws SQLException, ClassNotFoundException;

    int deleteOne(long id) throws SQLException, ClassNotFoundException;

    List<T> getAll() throws SQLException, ClassNotFoundException;
    T findById(U id) throws SQLException, ClassNotFoundException;
    int updateOne(T object) throws SQLException, ClassNotFoundException;
}

