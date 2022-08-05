import { MovieCard } from './MovieCard';
import styles from './MovieGrid.module.css';
import { useState, useEffect } from 'react';
import { get } from '../utils/httpClient';
import { useLocation } from "react-router";
import { useNavigate } from 'react-router-dom';
import {Spinner} from './Spinner';


export function MovieGrid() {

    //estado > useteState
    const [peliculas, setPeliculas] = useState([]);
    const query =  new URLSearchParams(useLocation().search);
    const search = query.get("search");
    const [isLoading,setIsLoading] = useState(true);

    //cuando se carga el componente se ejecuta "el que tiene []"
    useEffect( ()=> {
      setIsLoading(true);
      const urlSearch = search
        ? `/search/movie?query=`+search
        : `/discover/movie`; 

        get(urlSearch)     
        .then(data => setPeliculas(data.results), setIsLoading(false));
    },[search]);

    if(isLoading){
      return<Spinner/>
    }

    return (
        <ul className={styles.movieGrid}>
            {
              peliculas.map((movie) =>{
                return <MovieCard key={movie.id} movie={movie}></MovieCard>
              })
            }
        </ul>
    );
}