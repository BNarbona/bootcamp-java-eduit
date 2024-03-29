import { useLocation } from "react-router-dom";
import { MovieGrid } from "./MovieGrid";
import { SearchMovie } from './SearchMovie';


export function Landing() {
    const query =  new URLSearchParams(useLocation().search);
    const search = query.get("search");
    return (
        <>
            <SearchMovie/>
            <MovieGrid key={search} search={search}/>
        </>
    );
}