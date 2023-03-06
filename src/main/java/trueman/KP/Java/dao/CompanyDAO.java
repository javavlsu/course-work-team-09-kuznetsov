package ru.truemen.laba3.dao;

import ru.truemen.laba3.beans.Company;
import ru.truemen.laba3.connection.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompanyDAO implements CrudDAO<Company, Long> {

    Util util = new Util();

    @Override
    public int createOne(Company company) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = null;
        Connection connection = util.getConnection();

        String sql =
                "INSERT INTO COMPANY(`COMPANY_NAME`) VALUES (?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, company.getName());

            preparedStatement.executeUpdate();

        }catch (SQLException e){
            System.out.println("Ошибка выполнения запроса.\n" + e.toString());
            return 0;
        } finally {
            if (preparedStatement != null){
                preparedStatement.close();
            }
            if (connection != null){
                connection.close();
            }
        }
        return 1;
    }

    @Override
    public int deleteOne(long id) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = null;
        Connection connection = util.getConnection();

        PreparedStatement preparedStatementManager = null;

        String sql = "DELETE FROM COMPANY WHERE COMPANY_ID = ?";
        String sqlPlayers = "DELETE FROM MANAGER WHERE MANAGER_COMPANY_ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatementManager = connection.prepareStatement(sql);

            preparedStatement.setLong(1, id);
            preparedStatementManager.setLong(1, id);

            preparedStatementManager.executeUpdate();
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            System.out.println("Ошибка выполнения запроса.\n" + e.toString());
            return 0;
        } finally {
            if (preparedStatement != null && preparedStatementManager != null){
                preparedStatement.close();
                preparedStatementManager.close();
            }
            if (connection != null){
                connection.close();
            }
        }
        System.out.println("Компания удалена успешно");
        return 1;
    }

    @Override
    public List<Company> getAll() throws SQLException, ClassNotFoundException {
        List<Company> companyList = new ArrayList<Company>();
        Connection connection = util.getConnection();

        String sql = "SELECT * FROM COMPANY";

        Statement statement = null;
        try{
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                Company company = new Company();

                company.setId(resultSet.getInt("COMPANY_ID"));
                company.setName(resultSet.getString("COMPANY_NAME"));

                companyList.add(company);
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
        return companyList;
    }

    @Override
    public Company findById(Long id) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = null;
        Connection connection = util.getConnection();

        String sql = "SELECT * FROM COMPANY WHERE COMPANY_ID = ?";

        Company company = new Company();
        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();
            company.setId(resultSet.getInt("COMPANY_ID"));
            company.setName(resultSet.getString("COMPANY_NAME"));

            resultSet.close();
        }catch (SQLException e){
            System.out.println("Ошибка выполнения запроса.\n" + e.toString());
        }finally {
            if (preparedStatement != null){
                preparedStatement.close();
            }
            if (connection != null){
                connection.close();
            }
        }
        return company;
    }


    @Override
    public int updateOne(Company company) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = null;
        Connection connection = util.getConnection();

        String sql =
                "UPDATE COMPANY SET `COMPANY_NAME` = ? WHERE COMPANY_ID = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, company.getName());
            preparedStatement.setLong(2, company.getId());

            preparedStatement.executeUpdate();

        }catch (SQLException e){
            System.out.println("Ошибка выполнения запроса.\n" + e.toString());
            return 0;
        } finally {
            if (preparedStatement != null){
                preparedStatement.close();
            }
            if (connection != null){
                connection.close();
            }
        }
        return 1;
    }
}