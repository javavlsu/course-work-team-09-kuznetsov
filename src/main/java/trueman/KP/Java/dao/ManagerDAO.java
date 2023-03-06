package ru.truemen.laba3.dao;

import ru.truemen.laba3.beans.Manager;
import ru.truemen.laba3.connection.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ManagerDAO implements CrudDAO<Manager, Long> {

    Util util = new Util();
    @Override
    public int createOne(Manager manager) throws SQLException, ClassNotFoundException  {
        PreparedStatement preparedStatement = null;
        Connection connection = util.getConnection();

        String sql =
                "INSERT INTO Manager(MANAGER_NAME, MANAGER_SURNAME, MANAGER_BIRTHDATE, MANAGER_COMPANYID)" +
                        " VALUES (?, ?, ?, ?)";

        try {
            java.util.Date date = new java.util.Date();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, manager.getName());
            preparedStatement.setString(2, manager.getSurname());
            preparedStatement.setDate(3, new java.sql.Date(date.getTime()));
            preparedStatement.setLong(4, manager.getCompanyid());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Ошибка выполнения запроса.\n" + e.toString());
            return 0;
        } finally {
            if (preparedStatement != null)
            {
                preparedStatement.close();
            }
            if (connection != null)
            {
                connection.close();
            }
        }
        return 1;
    }


    @Override
    public int updateOne(Manager manager) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = null;
        Connection connection = util.getConnection();

        String sql =
                "UPDATE Manager SET `MANAGER_NAME` = ?, MANAGER_SURNAME = ?, MANAGER_BIRTHDATE = ?, MANAGER_COMPANYID = ? " +
                        "WHERE MANAGER_ID = ?";

        try {
            java.util.Date date = new java.util.Date();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, manager.getName());
            preparedStatement.setString(2, manager.getSurname());
            preparedStatement.setDate(3, new java.sql.Date(date.getTime()));
            preparedStatement.setLong(4, manager.getCompanyid());
            preparedStatement.setLong(5, manager.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Ошибка выполнения запроса.\n" + e.toString());
            return 0;
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return 1;
    }

    @Override
    public int deleteOne(long id) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = null;
        Connection connection = util.getConnection();

        String sql = "DELETE FROM MANAGER WHERE MANAGER_ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Ошибка выполнения запроса.\n" + e.toString());
            return 0;
        } /* finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } */
        System.out.println("Менеджер успешно удален из Базы данных");
        return 1;
    }


    @Override
    public List<Manager> getAll() throws SQLException, ClassNotFoundException {
        List<Manager> ManagerList = new ArrayList<Manager>();
        Connection connection = util.getConnection();

        String sql = "SELECT * FROM MANAGER";

        Statement statement = null;
        try {
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Manager manager = new Manager();
                manager.setId(resultSet.getInt("MANAGER_ID"));
                manager.setName(resultSet.getString("MANAGER_NAME"));
                manager.setSurname(resultSet.getString("MANAGER_SURNAME"));
                manager.setBirthdate(resultSet.getDate("MANAGER_BIRTHDATE"));
                manager.setCompanyid(resultSet.getInt("MANAGER_COMPANYID"));

                ManagerList.add(manager);
            }
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Ошибка выполнения запроса.\n" + e.toString());
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return ManagerList;
    }

    @Override
    public Manager findById(Long id) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = null;
        Connection connection = util.getConnection();

        String sql = "SELECT * FROM MANAGER WHERE MANAGER_ID = ?";

        Manager manager = new Manager();
        try {

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();
            manager.setId(resultSet.getInt("MANAGER_ID"));
            manager.setName(resultSet.getString("MANAGER_NAME"));
            manager.setSurname(resultSet.getString("MANAGER_SURNAME"));
            manager.setBirthdate(resultSet.getDate("MANAGER_BIRTHDATE"));
            manager.setCompanyid(resultSet.getInt("MANAGER_COMPANYID"));

            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Ошибка выполнения запроса.\n" + e.toString());
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return manager;
    }
    public List<Manager> getByCompany(Long companyId) throws SQLException, ClassNotFoundException {
        List<Manager> ManagerList = new ArrayList<Manager>();
        Connection connection = Util.getConnection();
        String sql = "SELECT * FROM Manager WHERE Manager_company_id = ?";
        PreparedStatement preparedStatement = null;

        Statement statement = null;
        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, companyId);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Manager manager = new Manager();
                manager.setId(resultSet.getInt("MANAGER_ID"));
                manager.setName(resultSet.getString("MANAGER_NAME"));
                manager.setSurname(resultSet.getString("MANAGER_SURNAME"));
                manager.setBirthdate(resultSet.getDate("MANAGER_BIRTHDATE"));
                manager.setCompanyid(resultSet.getInt("MANAGER_COMPANYID"));

                ManagerList.add(manager);
            }
            resultSet.close();
        }catch (SQLException e){
            System.out.println("Ошибка выполнения запроса.\n" + e.toString());
        }finally {
            if (statement != null){
                statement.close();
            }
            if (connection != null){
                connection.close();
            }
        }
        return ManagerList;
    }
}