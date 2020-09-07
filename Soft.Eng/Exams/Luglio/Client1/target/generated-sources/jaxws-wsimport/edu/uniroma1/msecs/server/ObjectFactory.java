
package edu.uniroma1.msecs.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.uniroma1.msecs.server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDirettore_QNAME = new QName("http://server.msecs.uniroma1.edu/", "getDirettore");
    private final static QName _GetMovie_QNAME = new QName("http://server.msecs.uniroma1.edu/", "getMovie");
    private final static QName _GetDirectorResponse_QNAME = new QName("http://server.msecs.uniroma1.edu/", "getDirectorResponse");
    private final static QName _GetMovieResponse_QNAME = new QName("http://server.msecs.uniroma1.edu/", "getMovieResponse");
    private final static QName _GetDirettoreResponse_QNAME = new QName("http://server.msecs.uniroma1.edu/", "getDirettoreResponse");
    private final static QName _GetFilmResponse_QNAME = new QName("http://server.msecs.uniroma1.edu/", "getFilmResponse");
    private final static QName _GetMovies_QNAME = new QName("http://server.msecs.uniroma1.edu/", "getMovies");
    private final static QName _GetMoviesResponse_QNAME = new QName("http://server.msecs.uniroma1.edu/", "getMoviesResponse");
    private final static QName _Movie_QNAME = new QName("http://server.msecs.uniroma1.edu/", "movie");
    private final static QName _GetFilm_QNAME = new QName("http://server.msecs.uniroma1.edu/", "getFilm");
    private final static QName _Director_QNAME = new QName("http://server.msecs.uniroma1.edu/", "director");
    private final static QName _GetDirector_QNAME = new QName("http://server.msecs.uniroma1.edu/", "getDirector");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.uniroma1.msecs.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMovieResponse }
     * 
     */
    public GetMovieResponse createGetMovieResponse() {
        return new GetMovieResponse();
    }

    /**
     * Create an instance of {@link GetDirettoreResponse }
     * 
     */
    public GetDirettoreResponse createGetDirettoreResponse() {
        return new GetDirettoreResponse();
    }

    /**
     * Create an instance of {@link GetFilmResponse }
     * 
     */
    public GetFilmResponse createGetFilmResponse() {
        return new GetFilmResponse();
    }

    /**
     * Create an instance of {@link GetMovies }
     * 
     */
    public GetMovies createGetMovies() {
        return new GetMovies();
    }

    /**
     * Create an instance of {@link GetMoviesResponse }
     * 
     */
    public GetMoviesResponse createGetMoviesResponse() {
        return new GetMoviesResponse();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link GetFilm }
     * 
     */
    public GetFilm createGetFilm() {
        return new GetFilm();
    }

    /**
     * Create an instance of {@link Director }
     * 
     */
    public Director createDirector() {
        return new Director();
    }

    /**
     * Create an instance of {@link GetDirector }
     * 
     */
    public GetDirector createGetDirector() {
        return new GetDirector();
    }

    /**
     * Create an instance of {@link GetDirettore }
     * 
     */
    public GetDirettore createGetDirettore() {
        return new GetDirettore();
    }

    /**
     * Create an instance of {@link GetMovie }
     * 
     */
    public GetMovie createGetMovie() {
        return new GetMovie();
    }

    /**
     * Create an instance of {@link GetDirectorResponse }
     * 
     */
    public GetDirectorResponse createGetDirectorResponse() {
        return new GetDirectorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirettore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.msecs.uniroma1.edu/", name = "getDirettore")
    public JAXBElement<GetDirettore> createGetDirettore(GetDirettore value) {
        return new JAXBElement<GetDirettore>(_GetDirettore_QNAME, GetDirettore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.msecs.uniroma1.edu/", name = "getMovie")
    public JAXBElement<GetMovie> createGetMovie(GetMovie value) {
        return new JAXBElement<GetMovie>(_GetMovie_QNAME, GetMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirectorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.msecs.uniroma1.edu/", name = "getDirectorResponse")
    public JAXBElement<GetDirectorResponse> createGetDirectorResponse(GetDirectorResponse value) {
        return new JAXBElement<GetDirectorResponse>(_GetDirectorResponse_QNAME, GetDirectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.msecs.uniroma1.edu/", name = "getMovieResponse")
    public JAXBElement<GetMovieResponse> createGetMovieResponse(GetMovieResponse value) {
        return new JAXBElement<GetMovieResponse>(_GetMovieResponse_QNAME, GetMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirettoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.msecs.uniroma1.edu/", name = "getDirettoreResponse")
    public JAXBElement<GetDirettoreResponse> createGetDirettoreResponse(GetDirettoreResponse value) {
        return new JAXBElement<GetDirettoreResponse>(_GetDirettoreResponse_QNAME, GetDirettoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.msecs.uniroma1.edu/", name = "getFilmResponse")
    public JAXBElement<GetFilmResponse> createGetFilmResponse(GetFilmResponse value) {
        return new JAXBElement<GetFilmResponse>(_GetFilmResponse_QNAME, GetFilmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.msecs.uniroma1.edu/", name = "getMovies")
    public JAXBElement<GetMovies> createGetMovies(GetMovies value) {
        return new JAXBElement<GetMovies>(_GetMovies_QNAME, GetMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.msecs.uniroma1.edu/", name = "getMoviesResponse")
    public JAXBElement<GetMoviesResponse> createGetMoviesResponse(GetMoviesResponse value) {
        return new JAXBElement<GetMoviesResponse>(_GetMoviesResponse_QNAME, GetMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.msecs.uniroma1.edu/", name = "movie")
    public JAXBElement<Movie> createMovie(Movie value) {
        return new JAXBElement<Movie>(_Movie_QNAME, Movie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.msecs.uniroma1.edu/", name = "getFilm")
    public JAXBElement<GetFilm> createGetFilm(GetFilm value) {
        return new JAXBElement<GetFilm>(_GetFilm_QNAME, GetFilm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Director }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.msecs.uniroma1.edu/", name = "director")
    public JAXBElement<Director> createDirector(Director value) {
        return new JAXBElement<Director>(_Director_QNAME, Director.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.msecs.uniroma1.edu/", name = "getDirector")
    public JAXBElement<GetDirector> createGetDirector(GetDirector value) {
        return new JAXBElement<GetDirector>(_GetDirector_QNAME, GetDirector.class, null, value);
    }

}
