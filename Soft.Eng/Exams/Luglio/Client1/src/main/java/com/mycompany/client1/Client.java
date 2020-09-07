/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client1;
import edu.uniroma1.msecs.server.Director;
import edu.uniroma1.msecs.server.Exam;
import edu.uniroma1.msecs.server.ExamImpl;
import edu.uniroma1.msecs.server.ExamImplService;
import edu.uniroma1.msecs.server.Movie;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author biar
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException {
       List<Integer> movies = new LinkedList<>();
        try {
            ExamImplService service = new ExamImplService();
            Exam port = service.getExamImplPort();
            
            movies = port.getMovies();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        Director director;
        Movie movie;
        for(int i = 0; i < movies.size(); i++) {
            try {
                ExamImplService service = new ExamImplService();
                Exam port = service.getExamImplPort();
                
                movie = port.getMovie(movies.get(i));
                director = port.getDirector(movie.getDirectorID());

                System.out.println("Movie " + movie.getID() + ": "
                                   + movie.getTitle() + " (" + movie.getYear() + ")\n"
                                   + "Director " + director.getID() + ": "
                                   + director.getName() + " (" + director.getYearOfBirth() + ")\n");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        
        /*  MIE PROVE
        System.out.println("================================");
        Class.forName("org.sqlite.JDBC");
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:/home/biar/msecs-1-se-2019_07.db");
            
            
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM MOVIES WHERE DIRECTORID = ?;");
            statement.setInt(1, 0);
            statement.setQueryTimeout(30);
            
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getInt("ID")+","+ rs.getInt("directorID")+","+ rs.getString("title")+","+
                                 rs.getString("year"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        */ 
    }
    
    
    /* MIA IMPLEMENTAZIONE
    public static void main(String[] args) {
       List<Movie> movies = getFilm();
       Iterator<Movie> it=movies.iterator();
       while(it.hasNext()){
           Movie temp=it.next();
           Director director= getDirector(temp.getDirectorID());
           System.out.println("\n");
           System.out.println("Movie = "+ temp.getTitle() + "of year: "+ temp.getYear() + "with Director: "+
                   director.getName() +"who was born in: "+ director.getYearOfBirth());
           System.out.println("\n");

       }
       
    }
    
    
    public static List<Movie> getFilm(){
        List<Movie> movies=new ArrayList<>();
        try { // Call Web Service Operation
            edu.uniroma1.msecs.server.ExamImplService service = new edu.uniroma1.msecs.server.ExamImplService();
            edu.uniroma1.msecs.server.Exam port = service.getExamImplPort();
            // TODO process result here
            java.util.List<edu.uniroma1.msecs.server.Movie> result = port.getFilm();
            movies=result;
            //System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return movies;
    }
    
    public static Director getDirector(int ID){
        Director director = null;
        try { // Call Web Service Operation
            edu.uniroma1.msecs.server.ExamImplService service = new edu.uniroma1.msecs.server.ExamImplService();
            edu.uniroma1.msecs.server.Exam port = service.getExamImplPort();
            // TODO initialize WS operation arguments here
            int arg0 = ID;
            // TODO process result here
            edu.uniroma1.msecs.server.Director result = port.getDirector(arg0);
            director=result;
            //System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return director;
    }
    */
}
