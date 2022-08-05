import { useState } from 'react';
import { FaSearch } from "react-icons/fa";
import styles from './SearchMovie.module.css';
import { useLocation } from "react-router";
//import { useQuery } from './hooks/useQuery';
import { useNavigate } from 'react-router-dom';

export function SearchMovie() {
    
    const query =  new URLSearchParams(useLocation().search);
    const search = query.get("search");
    const history = useNavigate();
    const [searchKey, setSearchKey] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        history (`/?search=${searchKey}`);
    }

    return(
        <form onSubmit={handleSubmit} className={styles.searchContainer}>
            <div className={styles.searchBox}>
                <input placeholder='buscar' 
                    className={styles.searchInput}
                    value={searchKey} 
                    type="text"
                    onChange={(e) => setSearchKey(e.target.value) }/>
                <button 
                    className={styles.searchButton}
                    type="submit">
                        <FaSearch size= {25}/>
                </button>
            </div>
        </form>
    );
}