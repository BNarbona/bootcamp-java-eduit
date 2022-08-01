import { BrowserRouter,Routes,Route, Link } from 'react-router-dom';
import styles from './App.module.css';
import { MovieGrid } from './components/MovieGrid';
import { MovieDetail } from './components/MovieDetail';
import { SearchMovie } from './components/SearchMovie';

function App() {
  // console.log(styles);

  return (
    <BrowserRouter>
      <header>
        <Link to={'/'}>
          <div>
            <h1 className={styles.title}>Peliculas</h1>
            <SearchMovie/>
          </div>
        </Link>
      </header>
      <main>
        <Routes>
          <Route path='/' element={<MovieGrid/>}/>
          <Route path='/detail/:movieId' element={<MovieDetail/>}/>
        </Routes>
      </main>
    </BrowserRouter>
  );
}

export default App;
