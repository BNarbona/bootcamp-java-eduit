import styles from './App.module.css';
import { MovieGrid } from './components/MovieGrid';


function App() {
  // console.log(styles);

  return (
    <>
      <header>
        <h1 className={styles.primerParrafo}>Peliculas</h1>
      </header>
      <main>
        <MovieGrid></MovieGrid>
      </main>
    </>
  );
}

export default App;
