import { useState } from 'react';
import './App.css';
import DiasDeSemana from './Components/DiasDeSemana';
import PrimerComponente from './Components/PrimerComponente';

const dias = ['LUNES','MARTES','MIERCOLES']


function App() {
  //estado local del componente
  const [edad,setEdad] = useState(0);
  //edad=10; no se puede
  //setEdad(150); no se puede
  const [valor,setValor] = useState('');
  
  const incrementar = () => {
      console.log('edad:',edad)
      setEdad(edad+1);
  }

  const [diasSemana,setDiasSemana] = useState(dias);

  const decrementar = () => {
    if(edad>0){
    setEdad(edad-1);
    }
}

const cambiar = () => {
  setEdad(valor);

}

const change = (newValor) => {
  console.log(newValor);
  setValor(newValor);

}

  return (
    <>
      <div className = 'row'>
            <div className='col-3'>
              <label htmlFor='valor'>Edad: </label>
              <input type='number' 
                value={valor}
                id='valor' 
                onChange={(e) => change(e.target.value)}></input>
              <label>Edad: {edad}</label>
            <DiasDeSemana 
              diasSemana = {diasSemana}
              diaACtual = {'LUNES'}>
            </DiasDeSemana>  
            </div> 
            <div className='col-3'>
              <button className='btn btn-info' 
                    onClick={incrementar}>
                Incrementar Edad
              </button>
            </div>
            <div className='col-3'>
              <button className='btn btn-success' 
                    onClick={decrementar}>
                Decrementar Edad
              </button>
            </div>
            <div className='col-3'>
              <button className='btn btn-primary' 
                    onClick={cambiar}>
                Cambiar Edad
              </button>
            </div>  
      </div>
    </>
  );
}

export default App;
