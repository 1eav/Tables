package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTables {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/top";
        String user = "root";
        String pass = "1eav";
        String line = "===========================================================================================";
        String column = " | ";
        String m1 = "_____________";
        String m2 = "ВЫБОР ТАБЛИЦЫ";
        String m3 = "=============";
        String m4 = "1<| courses";
        String m5 = "2<| purchaselist";
        String m6 = "3<| students";
        String m7 = "4<| subscriptions";
        String m8 = "5<| teachers";
        String m9 = "0<| Закрыть";
        String m10 = "Выбор категории: ";
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            System.out.println(m1);
            System.out.println(m2);
            System.out.println(m3);
            System.out.println(m4);
            System.out.println(m5);
            System.out.println(m6);
            System.out.println(m7);
            System.out.println(m8);
            System.out.println(m9);
            System.out.print(m10);
            switch (choice = input.next().charAt(0)) {
                case '1':
                    try {
                        Connection connection_1 = DriverManager.getConnection(url, user, pass);
                        Statement statement_1 = connection_1.createStatement();
                        ResultSet resultSet_1 =  statement_1.executeQuery("SELECT * FROM top.courses");
                        System.out.println(column + line);
                        while (resultSet_1.next()) {
                            String id = resultSet_1.getString("id");
                            String courseName = resultSet_1.getString("name");
                            String duration = resultSet_1.getString("duration");
                            String type = resultSet_1.getString("type");
                            String description = resultSet_1.getString("description");
                            String teacherId = resultSet_1.getString("teacher_id");
                            String studentsCount = resultSet_1.getString("students_count");
                            String price = resultSet_1.getString("price");
                            String pricePerHour = resultSet_1.getString("price_per_hour");
                            System.out.println(column + "id: " + id);
                            System.out.println(column + "name: " + courseName);
                            System.out.println(column + "duration: " + duration);
                            System.out.println(column + "type: " + type);
                            System.out.println(column + "description: " + description);
                            System.out.println(column + "teacherId: " + teacherId);
                            System.out.println(column + "studentsCount: " + studentsCount);
                            System.out.println(column + "price: " + price);
                            System.out.println(column + "pricePerHour: " + pricePerHour);
                            System.out.println(column + line);
                        }
                        resultSet_1.close();
                        statement_1.close();
                        connection_1.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case '2':
                    try {
                        Connection connection_2 = DriverManager.getConnection(url, user, pass);
                        Statement statement_2 = connection_2.createStatement();
                        ResultSet resultSet_2 =  statement_2.executeQuery("SELECT * FROM top.purchaselist");
                        System.out.println(column + line);
                        while (resultSet_2.next()) {
                            String studentName = resultSet_2.getString("student_name");
                            String courseName = resultSet_2.getString("course_name");
                            String price = resultSet_2.getString("price");
                            String subscriptionDate = resultSet_2.getString("subscription_date");
                            System.out.println(column + "studentName: " + studentName);
                            System.out.println(column + "courseName: " + courseName);
                            System.out.println(column + "price: " + price);
                            System.out.println(column + "subscriptionDate: " + subscriptionDate);
                            System.out.println(column + line);
                        }
                        resultSet_2.close();
                        statement_2.close();
                        connection_2.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case '3':
                    try {
                        Connection connection_3 = DriverManager.getConnection(url, user, pass);
                        Statement statement_3 = connection_3.createStatement();
                        ResultSet resultSet_3 =  statement_3.executeQuery("SELECT * FROM top.students");
                        System.out.println(column + line);
                        while (resultSet_3.next()) {
                            String id = resultSet_3.getString("id");
                            String name = resultSet_3.getString("name");
                            String age = resultSet_3.getString("age");
                            String registration_date = resultSet_3.getString("registration_date");
                            System.out.println(column + "id: " + id);
                            System.out.println(column + "name: " + name);
                            System.out.println(column + "age: " + age);
                            System.out.println(column + "registration_date: " + registration_date);
                            System.out.println(column + line);
                        }
                        resultSet_3.close();
                        statement_3.close();
                        connection_3.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case '4':
                    try {
                        Connection connection_4 = DriverManager.getConnection(url, user, pass);
                        Statement statement_4 = connection_4.createStatement();
                        ResultSet resultSet_4 =  statement_4.executeQuery("SELECT * FROM top.subscriptions");
                        System.out.println(column + line);
                        while (resultSet_4.next()) {
                            String studentId = resultSet_4.getString("student_id");
                            String courseId = resultSet_4.getString("course_id");
                            String subscriptionDate = resultSet_4.getString("subscription_date");
                            System.out.println(column + "studentId: " + studentId);
                            System.out.println(column + "courseId: " + courseId);
                            System.out.println(column + "subscriptionDate: " + subscriptionDate);
                            System.out.println(column + line);
                        }
                        resultSet_4.close();
                        statement_4.close();
                        connection_4.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case '5':
                    try {
                        Connection connection_5 = DriverManager.getConnection(url, user, pass);
                        Statement statement_5 = connection_5.createStatement();
                        ResultSet resultSet_5 =  statement_5.executeQuery("SELECT * FROM top.teachers");
                        System.out.println(column + line);
                        while (resultSet_5.next()) {
                            String id = resultSet_5.getString("id");
                            String name = resultSet_5.getString("name");
                            String salary = resultSet_5.getString("salary");
                            String age = resultSet_5.getString("age");
                            System.out.println(column + "id: " + id);
                            System.out.println(column + "name: " + name);
                            System.out.println(column + "salary: " + salary);
                            System.out.println(column + "age: " + age);
                            System.out.println(column + line);
                        }
                        resultSet_5.close();
                        statement_5.close();
                        connection_5.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case '0':
                    break;
                default:
                    System.out.println("Ошибка ввода. Выберите категорию");
            }
        } while (choice != '0');
    }
}