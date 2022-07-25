function DiasDeSemana({diasSemana,diaActual}){
    return(
    <div>
        <h3>DIAS</h3>
        <ul>
            {
            diasSemana.map((dia,index) => {
                return <li key={index}>{dia} </li>
            })
            }
        </ul>
    </div>
    );
}
export default DiasDeSemana;