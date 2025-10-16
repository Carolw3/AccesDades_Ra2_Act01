package prova.act01.prova_act01.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import prova.act01.prova_act01.model.Student;

@Repository

public class StudentRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final class StudentRowMapper implements RowMapper<Student>{
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException{

            Student student = new Student();
            student.setId(rs.getLong("id"));
            student.setNom(rs.getString("nom"));
            student.setCognom(rs.getString("cognom"));
            student.setAge(rs.getInt("age"));
            student.setCicle(rs.getString("cicle"));
            student.setAny(rs.getInt("any"));

            return student;
        }


    }



    public List<Student> findAll(){
        String sql = "select * from students";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }

    public void save(String nom, String cognom, int age, String cicle, int any){

        String sql = "insert into students (nom, cognom, age, cicle, `any`) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql, nom, cognom, age, cicle, any);
    }

}
