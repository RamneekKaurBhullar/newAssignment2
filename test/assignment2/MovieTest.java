
package assignment2;

import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ramneek kaur
 */
public class MovieTest {
    
    Movie validMovie;
    
    public MovieTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
    }
    
    @Before
    public void setUp() {
        validMovie = new Movie ("Ladki","Hindi", LocalDate.of(2017, Month.MARCH, 10),"DK productions","Romantic Movie");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMovieName method, of class Movie.
     */
    @Test
    public void testGetMovieName() {
        
        
        String expResult = "Ladki";
        String result = validMovie.getMovieName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMovieName method, of class Movie.
     */
    @Test
    public void testSetMovieName() {
       validMovie.setMovieName("Ranchi");
       String result = validMovie.getMovieName();
       assertEquals("Ranchi",result);   
    }
    /**
     * This test will attempt to create Movie Name with an empty String
     */
    @Test
    public void testInvalidMovieName()
    {
        try{
            validMovie.setMovieName("");            
            fail("Movie name should never be empty");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getLanguage method, of class Movie.
     */
    @Test
    public void testGetLanguage() {
       String expResult = "Hindi";
       String result = validMovie.getLanguage();
       assertEquals(expResult, result);
       
    }

    /**
     * Test of setLanguage method, of class Movie.
     */
    @Test
    public void testSetLanguage() {
         validMovie.setLanguage("English");
        assertEquals("English", validMovie.getLanguage());
    }
    
    /**
     * This test will attempt to create Language with an empty String
     */
    @Test
    public void testInvalidLanguage()
    {
        try{
            validMovie.setLanguage("");            
            fail("Language should never be empty");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }


    /**
     * Test of getReleaseDate method, of class Movie.
     */
    @Test
    public void testGetReleaseDate() {
        LocalDate expResult = LocalDate.of(2017, Month.MARCH, 10);
        LocalDate result = validMovie.getReleaseDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReleaseDate method, of class Movie.
     */
    @Test
    public void testSetReleaseDate() {
        LocalDate releaseDate = LocalDate.of(2011, Month.JULY, 10);
        validMovie.setReleaseDate(releaseDate);
        assertEquals(releaseDate, validMovie.getReleaseDate());
    }
    
    /**
     * Test of getProductionHouse method, of class Movie.
     */
    @Test
    public void testGetProductionHouse() {
        String expResult = "DK productions";
        String result = validMovie.getProductionHouse();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProductionHouse method, of class Movie.
     */
    @Test
    public void testSetProductionHouse() {
        validMovie.setProductionHouse("Star productions");
        assertEquals("Star productions", validMovie.getProductionHouse());
    
    }
    
    /**
     * This test will attempt to create Production House with an empty String
     */
    @Test
    public void testSetProductionHouseInvalid()
    {
        String productionHouse = "";
        try
        {
            validMovie.setProductionHouse("");
            fail("The setproductionHouse method with an empty argument should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getGenre method, of class Movie.
     */
    @Test
    public void testGetGenre() {
       String expResult = "Romantic Movie";
        String result = validMovie.getGenre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGenre method, of class Movie.
     */
    @Test
    public void testSetGenre() {
        validMovie.setGenre("Comedy Movie");
        assertEquals("Comedy Movie", validMovie.getGenre());
    }
    
    /**
     * This test will attempt to create Genre with an empty String
     */
    @Test
    public void testSetGenreInvalid()
    {
        String genre = "";
        try
        {
            validMovie.setGenre(genre);
            fail("The setGenre method with an empty argument should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
}
